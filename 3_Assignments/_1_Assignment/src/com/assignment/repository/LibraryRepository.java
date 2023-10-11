package com.assignment.repository;

import com.assignment.model.Library;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LibraryRepository implements CrudRepository<Library>, SearchRepository<Library> {

    private Map<Long, Library> libraryMap;
    private long nextId;

    public LibraryRepository() {
        libraryMap = new HashMap<>();
        nextId = 1;
    }

    @Override
    public Library create(Library library) {
        library.setLibraryId(nextId);
        libraryMap.put(nextId, library);
        nextId++;
        return library;
    }

    @Override
    public Library read(long id) {
        return libraryMap.get(id);
    }

    @Override
    public Library update(Library updatedLibrary) {
        long id = updatedLibrary.getLibraryId();
        if (libraryMap.containsKey(id)) {
            libraryMap.put(id, updatedLibrary);
            return updatedLibrary;
        }
        return null; // Library with the given ID does not exist
    }

    @Override
    public void delete(long id) {
        libraryMap.remove(id);
    }

    @Override
    public List<Library> search(String keyword) {
        return libraryMap.values()
                .stream()
                .filter(library -> library.getName().contains(keyword))
                .collect(Collectors.toList());
    }
}