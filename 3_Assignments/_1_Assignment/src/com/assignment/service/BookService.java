package com.assignment.service;
import com.assignment.model.Book;
import com.assignment.repository.BookRepository;
import com.assignment.repository.CrudRepository;

import java.util.List;

public class BookService implements CrudService<Book>, SearchService<Book>{
    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    @Override
    public Book create(Book book) {
        return bookRepository.create(book);
    }

    @Override
    public Book read(long id) {
        return bookRepository.read(id);
    }

    @Override
    public Book update(Book book) {
        return bookRepository.update(book);
    }

    @Override
    public void delete(long id) {
        bookRepository.delete(id);
    }

    @Override
    public List<Book> search(String keyword){
        return bookRepository.search(keyword);
    }
}
