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

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    public BookRepository bookRepository;
    @Autowired
    public AuthorRepository authorRepository;
    @Autowired
    public CategoryRepository categoryRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        // Book book = bookRepository.findByTitle("Przygoda");


//        Category category0 = new Category("Przygodowa");
//        categoryRepository.save(category0);
//        Category category1 = new Category("Historyczna");
//        categoryRepository.save(category1);
//
//        Author author0 = new Author("Jan", "Kowalski");
//        authorRepository.save(author0);
//        Author author1 = new Author("Zbigniew", "Boniek");
//        authorRepository.save(author1);
//        Author author2 = new Author("Edmund", "Ormanowski");
//        authorRepository.save(author2);
/*
        Set<Author> authors = new HashSet<>();
        authors.add(new Author("Jan", "Kowalski"));
        authors.add(new Author("Beata", "Mikołajczyk"));

        Category category = new Category("Sport");

        Book book = new Book("Przygoda", category, authors);
        bookRepository.save(book);
        */


//        Book book0 = new Book("Cztery Łapki");
//        Set<Author> authorss = new HashSet<>();
//        authorss.add(author0);
//        authorss.add(author2);
//        book0.setAuthors(authorss);
//        bookRepository.save(book0);
//
//        Set<Author> authors = new HashSet<>();
//        authors.add(new Author("Bolesław", "Birkholc"));
//        authors.add(new Author("Bernard", "Ornikowski"));
//        Category category = new Category("Sport");
//
//        Book book = new Book("Przygoda", category, authors);
//        bookRepository.save(book);

//        authors.clear();;
//        authors.add(new Author("Adam", "Mickiewicz"));
//
//        Category bookCategory = categoryRepository.findByName("Sport");
//
//        Book book2 = new Book("Przygoda", category, authors);
//        bookRepository.save(book2);


        //Book book = new Book("Przygoda", "Jan Kowalski");
        //bookRepository.save(book);
    }
}