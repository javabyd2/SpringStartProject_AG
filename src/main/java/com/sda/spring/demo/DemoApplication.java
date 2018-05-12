package com.sda.spring.demo;

import com.sda.spring.demo.model.Author;
import com.sda.spring.demo.model.Book;
import com.sda.spring.demo.model.Category;
import com.sda.spring.demo.repository.AuthorRepository;
import com.sda.spring.demo.repository.BookRepository;
import com.sda.spring.demo.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    public BookRepository bookRepository;
    public AuthorRepository authorRepository;
    public CategoryRepository categoryRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Category category0 = new Category("Przygodowa");
        categoryRepository.save(category0);
        Category category1 = new Category("Historyczna");
        categoryRepository.save(category1);

        Author author0 = new Author("Jan", "Kowalski");
        authorRepository.save(author0);
        Author author1 = new Author("Zbigniew", "Boniek");
        authorRepository.save(author1);

        Book book0 = new Book("Cztery Łapki");
        book0.setAuthors();
        bookRepository.save(book0);



        //Book book = new Book("Przygoda", "Jan Kowalski");
        //bookRepository.save(book);
    }
}