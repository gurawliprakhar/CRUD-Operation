package com.velamdir.CRUD.repository;

import com.velamdir.CRUD.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepo extends MongoRepository<Book, Integer> {
}
