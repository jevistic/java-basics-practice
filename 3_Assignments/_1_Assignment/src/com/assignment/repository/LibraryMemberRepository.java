package com.assignment.repository;

import com.assignment.model.LibraryMember;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LibraryMemberRepository implements CrudRepository<LibraryMember>, SearchRepository<LibraryMember> {
    private Map<Long, LibraryMember> libraryMemberMap;
    private long nextId;

    public LibraryMemberRepository() {
        libraryMemberMap = new HashMap<>();
        nextId = 1;
    }

    @Override
    public LibraryMember create(LibraryMember libraryMember) {
        libraryMember.setId(nextId);
        libraryMemberMap.put(nextId, libraryMember);
        nextId++;
        return libraryMember;
    }

    @Override
    public LibraryMember read(long id) {
        return libraryMemberMap.get(id);
    }

    @Override
    public LibraryMember update(LibraryMember updatedLibraryMember) {
        long id = updatedLibraryMember.getId();
        if (libraryMemberMap.containsKey(id)) {
            libraryMemberMap.put(id, updatedLibraryMember);
            return updatedLibraryMember;
        }
        return null; // Library member with the given ID does not exist
    }

    @Override
    public void delete(long id) {
        libraryMemberMap.remove(id);
    }

    @Override
    public List<LibraryMember> search(String keyword) {
        return libraryMemberMap.values()
                .stream()
                .filter(member -> member.getName().contains(keyword) || member.getEmail().contains(keyword))
                .collect(Collectors.toList());
    }
}