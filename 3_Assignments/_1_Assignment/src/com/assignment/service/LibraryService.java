package com.assignment.service;

import com.assignment.model.Library;
import com.assignment.repository.LibraryRepository;

import java.util.List;

public class LibraryService implements CrudService<Library>, SearchService<Library>{
    private LibraryRepository libraryRepository;

    public LibraryService(LibraryRepository libraryRepository) {
        this.libraryRepository = libraryRepository;
    }

    @Override
    public Library create(Library library) {
        return libraryRepository.create(library);
    }

    @Override
    public Library read(long id) {
        return libraryRepository.read(id);
    }

    @Override
    public Library update(Library library) {
        return libraryRepository.update(library);
    }

    @Override
    public void delete(long id) {
        libraryRepository.delete(id);
    }

    @Override
    public List<Library> search(String keyword) {
        return libraryRepository.search(keyword);
    }
}
