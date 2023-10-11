package com.assignment.model;

import java.util.List;

public class Library extends AbstractEntity {
    private long libraryId;
    private String name;
    private String location;

    private List<Book> books; // Many books in this library

    public Library() {
    }

    public Library(long libraryId, String name, String location, List<Book> books) {
        this.libraryId = libraryId;
        this.name = name;
        this.location = location;
        this.books = books;
    }

    public long getLibraryId() {
        return libraryId;
    }

    public void setLibraryId(long libraryId) {
        this.libraryId = libraryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

}