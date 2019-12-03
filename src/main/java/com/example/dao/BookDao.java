package com.example.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.model.Book;

@Repository
public class BookDao {

	private static final String GET_BOOKS="SELECT * FROM BOOK";
	private static final String GET_BOOKS_YEAR="SELECT * FROM BOOK WHERE YEAR=?";
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<Book> getBooks() {
		return (List<Book>) this.jdbcTemplate.query(GET_BOOKS, (rs,row)-> {
			Book book =new Book();
			book.setId(rs.getInt("id"));
			book.setTitle(rs.getString("title"));
			book.setAuthor(rs.getString("author"));
			book.setYear(rs.getString("year"));
			return book;
		});
	}
	public List<Book> getBooksByYear(String year) {
		return (List<Book>) this.jdbcTemplate.query(GET_BOOKS_YEAR, new Object[]{year}, (rs, row)-> {
			Book book =new Book();
			book.setId(rs.getInt("id"));
			book.setTitle(rs.getString("title"));
			book.setAuthor(rs.getString("author"));
			book.setYear(rs.getString("year"));
			return book;
		});
	}
}
