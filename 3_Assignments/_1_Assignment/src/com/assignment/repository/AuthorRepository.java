package com.assignment.repository;

import com.assignment.model.Author;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AuthorRepository implements CrudRepository<Author>, SearchRepository<Author> {
    private Map<Long, Author> authorMap;
    private long nextId;

    public AuthorRepository() {
        authorMap = new HashMap<>();
        nextId = 1;
    }

    @Override
    public Author create(Author author) {
        author.setId(nextId);
        authorMap.put(nextId, author);
        nextId++;
        return author;
    }

    @Override
    public Author read(long id) {
        return authorMap.get(id);
    }

    @Override
    public Author update(Author updatedAuthor) {
        long id = updatedAuthor.getId();
        if (authorMap.containsKey(id)) {
            authorMap.put(id, updatedAuthor);
            return updatedAuthor;
        }
        return null; // Author with the given ID does not exist
    }

    @Override
    public void delete(long id) {
        authorMap.remove(id);
    }

    @Override
    public List<Author> search(String keyword) {
        return authorMap.values()
                .stream()
                .filter(author -> author.getName().contains(keyword))
                .collect(Collectors.toList());
    }
}