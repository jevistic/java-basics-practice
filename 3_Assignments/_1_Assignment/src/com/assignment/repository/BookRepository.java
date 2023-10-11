package com.assignment.repository;
import com.assignment.model.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class BookRepository implements CrudRepository<Book>, SearchRepository<Book> {

    private Map<Long, Book> bookMap;
    private long nextId;

    public BookRepository() {
        bookMap = new HashMap<>();
        nextId = 1;
    }


    @Override
    public Book create(Book book) {
        book.setId(nextId);
        bookMap.put(nextId, book);
        nextId++;
        return book;
    }

    @Override
    public Book read(long id) {
        return bookMap.get(id);
    }

    @Override
    public Book update(Book updatedBook) {
        long id = updatedBook.getId();
        if (bookMap.containsKey(id)) {
            bookMap.put(id, updatedBook);
            return updatedBook;
        }
        return null; // Book with the given ID does not exist
    }

    @Override
    public void delete(long id) {
        bookMap.remove(id);
    }

    @Override
    public List<Book> search(String keyword) {
        List<Book> results = new ArrayList<>();
        for (Book book : bookMap.values()) {
            if (book.getTitle().contains(keyword) || book.getIsbn().contains(keyword)) {
                results.add(book);
            }
        }
        return results;
    }
}
