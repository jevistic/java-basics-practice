package com.assignment.service;

import com.assignment.model.Author;
import com.assignment.model.Book;
import com.assignment.repository.AuthorRepository;
import com.assignment.repository.SearchRepository;

import java.util.List;

public class AuthorService implements CrudService<Author>, SearchService<Author> {
    private AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public Author create(Author author) {
        return authorRepository.create(author);
    }

    @Override
    public Author read(long id) {
        return authorRepository.read(id);
    }

    @Override
    public Author update(Author author) {
        return authorRepository.update(author);
    }

    @Override
    public void delete(long id) {
        authorRepository.delete(id);
    }

    @Override
    public List<Author> search(String keyword) {
        return authorRepository.search(keyword);
    }
}
