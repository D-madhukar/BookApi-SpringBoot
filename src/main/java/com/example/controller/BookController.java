package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.BookDao;
import com.example.model.Book;

@RestController
public class BookController {

	@Autowired
	BookDao bookDao;
	
	@GetMapping("/books")
	public ResponseEntity<List<Book>> getBooks() {
		List<Book> books = bookDao.getBooks();
		HttpStatus status=HttpStatus.OK;
		if(books==null)
			status=HttpStatus.NOT_FOUND;
		return new ResponseEntity<List<Book>>(books, status);
	}
	@GetMapping("/books/year")
	public ResponseEntity<List<Book>> getBooks(@RequestParam String year) {
		List<Book> books = bookDao.getBooksByYear(year);
		HttpStatus status=HttpStatus.OK;
		if(books==null)
			status=HttpStatus.NOT_FOUND;
		return new ResponseEntity<List<Book>>(books, status);
	}
}
