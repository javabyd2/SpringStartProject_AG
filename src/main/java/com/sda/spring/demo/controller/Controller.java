package com.sda.spring.demo.controller;

import com.sda.spring.demo.dto.UserPropDTO;
import com.sda.spring.demo.model.Book;
import com.sda.spring.demo.model.Author;
import com.sda.spring.demo.model.Category;
import com.sda.spring.demo.service.AuthorService;
import com.sda.spring.demo.service.BookService;
import com.sda.spring.demo.service.CategoryService;
import com.sda.spring.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class Controller {

    @Autowired
    private BookService bookService;

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private AuthorService authorService;

    @Autowired
    private UserService userService;


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String hello() {
        return "Hello word";
    }

    @RequestMapping(value = "/booksRest", method = RequestMethod.GET)
    public List<Book> showBookList() {
        return bookService.getBooks();
    }

    @RequestMapping(value = "/category", method = RequestMethod.POST)
    public Category addCategory(
            @RequestBody Category category
    ) {
        return categoryService.save(category);
    }

    @RequestMapping(value = "/book", method = RequestMethod.POST)
    public Book addBook(
            @RequestBody Book book
    ) {
        return bookService.save(book);
    }

    @RequestMapping(value = "/book/{id}", method = RequestMethod.GET)
    public ResponseEntity<Book> getBookById(@PathVariable Long id) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(bookService.getBookById(id));
    }

    @RequestMapping(value = "/category/{id}", method = RequestMethod.GET)
    public Optional<Category> getBookCategoryById(@PathVariable Long id) {
        return categoryService.getCategoryById(id);
    }

    @RequestMapping(value = "/author/{id}", method = RequestMethod.GET)
    public Optional<Author> getBookAuthorById(@PathVariable Long id) {
        return authorService.getAuthorById(id);
    }

    @RequestMapping(value = "/categoriesRest", method = RequestMethod.GET)
    public List<Category> showCategories() {
        return categoryService.bookCategories();
    }

    @RequestMapping(value = "/authorsRest", method = RequestMethod.GET)
    public List<Author> showAuthors() {
        return authorService.getAuthors();
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<UserPropDTO> showUserProp() {
        return userService.getUsers();
    }

}