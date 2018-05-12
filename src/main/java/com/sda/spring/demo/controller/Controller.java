package com.sda.spring.demo.controller;

import com.sda.spring.demo.model.Book;
import com.sda.spring.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {

    @Autowired
    private BookRepository bookRepository;

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
        return bookRepository.findAll();

    }

}