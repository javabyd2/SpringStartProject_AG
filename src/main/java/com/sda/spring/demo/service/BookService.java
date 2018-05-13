package com.sda.spring.demo.service;

import com.sda.spring.demo.model.Book;
import com.sda.spring.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getBook() {
        /*
            dodatkowa logika
         */
        return bookRepository.findAll();
    }

    public Book save (Book book) {
        return bookRepository.save(book);
    }


}