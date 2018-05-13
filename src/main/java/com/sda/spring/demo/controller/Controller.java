package com.sda.spring.demo.controller;

import com.sda.spring.demo.model.Author;
import com.sda.spring.demo.model.Book;
import com.sda.spring.demo.model.Category;
import com.sda.spring.demo.service.AuthorService;
import com.sda.spring.demo.service.BookService;
import com.sda.spring.demo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class Controller {

    @Autowired
    private BookService bookService;
    @Autowired
    private AuthorService authorService;
    @Autowired
    private CategoryService categoryService;

    /*
        RequestMethod.GET
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String hello() {
        return "Hello Word!";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<String> stringList() {
        List<String> stringList = new ArrayList<>();
        stringList.add("Adrian");
        stringList.add("Roger");
        stringList.add("Dawid");
        stringList.add("Giełzak");
        return stringList;
    }

    @RequestMapping(value = "/books", method = RequestMethod.GET)
    public List<Book> schowBookList() {
        return bookService.getBook();
    }

    @RequestMapping(value = "/authors", method = RequestMethod.GET)
    public List<Author> schowAuthorList() {
        return authorService.getAuthors();
    }

    @RequestMapping(value = "/categories", method = RequestMethod.GET)
    public List<Category> schowCategoryList() {
        return categoryService.getCategories();
    }


    // wyświetlanie ksiązek, autorów, itd. po ID

    @RequestMapping(value = "/books/{id}", method = RequestMethod.GET)
    public Optional<Book> showBookById(@PathVariable Long id) {
        return bookService.getBookById(id);
    }

    @RequestMapping(value = "/authors/{id}", method = RequestMethod.GET)
    public Optional<Author> showAuthorById(@PathVariable Long id) {
        return authorService.getAuthorsById(id);
    }

    @RequestMapping(value = "/categories/{id}", method = RequestMethod.GET)
    public Optional<Category> showCategoryById(@PathVariable Long id) {
        return categoryService.getCategoriesById(id);
    }




    /*
        RequestMethod.POST
     */
    @RequestMapping(value = "/categories", method = RequestMethod.POST)
    public Category addCategory(@RequestBody Category category) {
        return categoryService.save(category);
    }

    @RequestMapping(value = "/authors", method = RequestMethod.POST)
    public Author addAuthor(@RequestBody Author author) {
        return authorService.save(author);
    }

    @RequestMapping(value = "/books", method = RequestMethod.POST)
    public Book addBook(@RequestBody Book book) {
        return bookService.save(book);
    }



}