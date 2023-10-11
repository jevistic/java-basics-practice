package com.assignment.repository;

import com.assignment.model.AbstractEntity;

import java.util.List;

public interface CrudRepository<T extends AbstractEntity> {
    T create(T entity);
    T read(long id);
    T update(T entity);
    void delete(long id);

//    List<T> search(String keyword);
}