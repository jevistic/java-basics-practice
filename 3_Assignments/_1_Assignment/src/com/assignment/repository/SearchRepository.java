package com.assignment.repository;

import com.assignment.model.AbstractEntity;

import java.util.List;

public interface SearchRepository<T extends AbstractEntity> {
    List<T> search(String keyword);
}