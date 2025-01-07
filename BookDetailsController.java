package com.eg.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.eg.demo.entity.BookDetailsEntity;
import com.eg.demo.service.BookDetailsImp;

@RestController
public class BookDetailsController {
	@Autowired
	BookDetailsImp bookDetailsImp;
	@GetMapping(value="GET/api/books")
	public List<BookDetailsEntity> getBooks(){
	List<BookDetailsEntity>details=bookDetailsImp.getBookDetails();
	return details;
}
	
	@GetMapping(value="GET/api/books/{id}")
	public BookDetailsEntity getBook(@PathVariable int id) {
		BookDetailsEntity detail=bookDetailsImp.getBookById(id);
		return detail;
	}
	
    @PostMapping(value="POST/api/books")
    public BookDetailsEntity createBooks(@RequestBody BookDetailsEntity entity) {
    	BookDetailsEntity details=bookDetailsImp.createBook(entity);
    	return details;
    }
    
    @PutMapping(value="PUT/api/books/{id}")
    public BookDetailsEntity updateBook(@PathVariable int id,@RequestBody BookDetailsEntity entity) {
    	BookDetailsEntity details=bookDetailsImp.updateBook(id, entity);
    	return details;
    }
    
    @DeleteMapping(value="DELETE/api/books/{id}")
    public String deleteBook(@PathVariable int id) {
    	String result=bookDetailsImp.deleteBook(id);
    	return result;
    }
    
}
