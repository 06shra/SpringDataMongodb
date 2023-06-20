package com.bookapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookapp.model.Book;
import com.bookapp.repository.BookRepository;
@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	BookRepository bookRepository;

	@Override
	public Book addBook(Book book) {
		return bookRepository.save(book);
	}

	@Override
	public List<Book> getAll() {
		return bookRepository.findAll();
	}

	@Override
	public List<Book> getByAuthor(String author) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getByCategory(String category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book findById(int bookId) {
		Optional<Book> bookOpt=bookRepository.findById(bookId);
		if(bookOpt.isPresent())
			return bookOpt.get();
		return null;
	}

	@Override
	public Book updateBook(int bookid, double price) {
		Book book=bookRepository.findById(bookid).get();
		return book;
		
	}

	@Override
	public void deleteBook(int bookid) {
		bookRepository.deleteById(bookid);
		
		
	}

}
