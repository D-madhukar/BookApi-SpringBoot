package com.example.model;

public class Book {
	int id;
	String title;
	String author;
	String year;
	public Book(int id, String title, String author, String year) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.year = year;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public Book() {
		super();
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	
}
