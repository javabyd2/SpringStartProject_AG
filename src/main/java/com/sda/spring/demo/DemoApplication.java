package com.sda.spring.demo;

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
	@Autowired
	public CategoryRepository categoryRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//		Book book = new Book("Przygoda");
//		bookRepository.save(book);

//		Book book = bookRepository.findByTitle("Przygoda");

//		Set<Author> authors = new HashSet<Author>();
//		authors.add(new Author("Jan", "Kowalski"));
//		authors.add(new Author("Zbigniew", "Nowak"));
//
//		Category category = new Category("Lektury szkolne");
//
//
//		Book book = new Book("Przygoda", category, authors);
//		bookRepository.save(book);

//		authors = new HashSet<Author>();
//		authors.add(new Author("Adam", "Mickiewicz"));
//
//		Category bookCategory = categoryRepository.findByName("Lektury szkolne");
//
//		Book book2 = new Book("Przygoda", bookCategory, authors);
//		bookRepository.save(book2);

	}
}
