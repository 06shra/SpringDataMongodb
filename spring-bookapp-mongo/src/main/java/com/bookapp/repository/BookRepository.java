package com.bookapp.repository;



import org.springframework.data.mongodb.repository.MongoRepository;

import com.bookapp.model.Book;

public interface BookRepository extends MongoRepository<Book,Integer>{

}
