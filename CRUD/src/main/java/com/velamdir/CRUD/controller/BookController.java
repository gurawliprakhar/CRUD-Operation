package com.velamdir.CRUD.controller;

import com.velamdir.CRUD.model.Book;
import com.velamdir.CRUD.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    private BookRepo repo;

    @PostMapping("/addBook")
    public String saveBook(@RequestBody Book book){
        repo.save(book);
        return "Added Successfully";
    }

    @GetMapping("/find all books")
    public List<Book> getBooks() {
        return repo.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable int id){
        repo.deleteById(id);
        return  "Deleted Successfully";
    }
}
