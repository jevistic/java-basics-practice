package com.assignment.service;


public interface CrudService<T> {
    T create(T entity);
    T read(long id);
    T update(T entity);
    void delete(long id);
}
