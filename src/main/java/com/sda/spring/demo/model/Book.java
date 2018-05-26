package com.sda.spring.demo.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, name = "book_id")
    private Long id;
    private String title;
    private Long isbn;

    @ManyToMany(cascade = CascadeType.MERGE)
    @JoinTable(joinColumns =
    @JoinColumn(name = "book_id"),
            inverseJoinColumns =
            @JoinColumn(name = "author_id")
    )
    private Set<Author> authors;

    @ManyToOne(cascade = CascadeType.MERGE)
    private Category category;

    @ManyToOne(cascade = CascadeType.ALL)
    private Publisher publisher;


    public Book(String title, Category category, Set<Author> authors) {
        this.title = title;
        this.category = category;
        this.authors = authors;
    }

    public Book () {}

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public Category getBookCategory() {
        return category;
    }

    public void setBookCategory(Category category) {
        this.category = category;
    }

    public Set<Author> getBookAuthors() {
        return authors;
    }

    public void setBookAuthors(Set<Author> authors) {
        this.authors = authors;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
