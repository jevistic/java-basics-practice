package com.assignment.service;

import com.assignment.model.Book;

import java.util.List;

public interface SearchService<T> {
    List<T> search(String keyword);
}
