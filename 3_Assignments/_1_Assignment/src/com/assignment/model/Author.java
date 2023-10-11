package com.assignment.model;

import java.util.List;

public class Author extends AbstractEntity {
    private String name;
    private String biography;


    private List<Book> books; // Many books by this author

    public Author() {
    }

    public Author(String name, String biography, List<Book> books) {
        this.name = name;
        this.biography = biography;
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

}
