package com.bookapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bookapp.model.Book;
import com.bookapp.service.BookService;

@SpringBootApplication
public class SpringBookappMongoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBookappMongoApplication.class, args);
	}
	
	@Autowired
	BookService bookService;
	

	@Override
	public void run(String... args) throws Exception {
		
		 Book book=new Book(3,"JAVA","Kathy","Tech",900.00);
		 bookService.addBook(book);
	
       Book book1=new Book(4,"Python","kito","Tech",930.00);
       bookService.addBook(book1);
		
		
		 Book book2=new Book(3,"spring","marathon","self",600.00);
		 bookService.addBook(book2);
		 
		 Book book3=new Book(4,"Mongodb","kacchamango","Tech",353.00);
		 bookService.addBook(book3);
		
		 Book book4=new Book(5,"JPA","yedegiri","self",643.00);
		 bookService.addBook(book4);
		 
		 Book book5=new Book(6,"Sql","sahiti","self",132.00);
		 bookService.addBook(book5);
		 
		
		bookService.getAll().forEach(System.out::println);
		
		
		
		/*
		 * Book book6=bookService.findById(2); System.out.println(book6);
		 * 
		 * Book updatedBook=bookService.updateBook(3,1000);
		 * System.out.println(updatedBook);
		 */
		  
		  
//		  bookService.deleteBook(4);
		 
	

	}

}
