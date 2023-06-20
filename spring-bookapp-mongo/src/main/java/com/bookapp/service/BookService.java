package com.bookapp.service;

import java.util.List;

import com.bookapp.model.Book;


public interface BookService {
	
	Book addBook(Book book);
	List<Book> getAll();
	List<Book> getByAuthor(String author);
	List<Book> getByCategory(String category);
	Book findById(int bookId);
	Book updateBook(int bookid,double price);
	void deleteBook(int bookid);
	

}
