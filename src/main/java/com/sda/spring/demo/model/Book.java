package com.sda.spring.demo.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, name = "book_id")
    private int id;
    private String title;
    private Long isbn;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(joinColumns =
    @JoinColumn(name = "book_id"),
            inverseJoinColumns =
            @JoinColumn(name = "author_id")
    )
    private Set<Author> authors;

    @ManyToOne(cascade = CascadeType.ALL)
    private Category category;

    public Book() {
    }

    public Book(String name, Category category, Set<Author> authors) {
        this.title = name;
        this.category = category;
        this.authors = authors;
    }

    public Book(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }


    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}