package com.eg.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.eg.demo.entity.BookDetailsEntity;

@Service
public interface BookDetailsService {
	
	List<BookDetailsEntity> getBookDetails();
	BookDetailsEntity getBookById(int id);
	BookDetailsEntity createBook(BookDetailsEntity entity);
	BookDetailsEntity updateBook(int id,BookDetailsEntity entity);
	String deleteBook(int id);

}
