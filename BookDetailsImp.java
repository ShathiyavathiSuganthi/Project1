package com.eg.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.eg.demo.entity.BookDetailsEntity;
import com.eg.demo.repo.BookDetailsRepository;

@Component
public class BookDetailsImp implements BookDetailsService{
	@Autowired 
	BookDetailsRepository bookDetailsRepository;

	@Override
	public List<BookDetailsEntity> getBookDetails() {
		List<BookDetailsEntity> details=bookDetailsRepository.findAll();
		
		return details;
	}

	@Override
	public BookDetailsEntity getBookById(int id) {
		Optional<BookDetailsEntity> entity=bookDetailsRepository.findById(id);
		BookDetailsEntity book=entity.get();
		return book;
	}

	@Override
	public BookDetailsEntity createBook(BookDetailsEntity entity) {
		int id=entity.getId();
		String title=entity.getTitle();
		String author=entity.getAuthor();
		String genre=entity.getGenre();
		int price=entity.getPrice();
		BookDetailsEntity bookEntity=new BookDetailsEntity();
		bookEntity.setId(id);
		bookEntity.setTitle(title);
		bookEntity.setAuthor(author);
		bookEntity.setGenre(genre);
		bookEntity.setPrice(price);
		BookDetailsEntity save=bookDetailsRepository.save(bookEntity);
		return save;
	}

	@Override
	public BookDetailsEntity updateBook(int id, BookDetailsEntity entity) {
		Optional<BookDetailsEntity> bookEntity=bookDetailsRepository.findById(id);
		BookDetailsEntity book=bookEntity.get();
		BookDetailsEntity save=null;
		if(bookEntity.isPresent()) {
			book.setTitle(entity.getTitle());
			book.setAuthor(entity.getAuthor());
			book.setGenre(entity.getGenre());
			book.setPrice(entity.getPrice());
			save=bookDetailsRepository.save(book);
		}
		
		
		return save;
	}

	@Override
	public String deleteBook(int id) {
	    Optional<BookDetailsEntity> bookEntity=bookDetailsRepository.findById(id);
        if(bookEntity.isPresent()) {
        	bookDetailsRepository.deleteById(id);
        }
		
		return "Boos Details are deleted";
	}
	
	
	
	

}
