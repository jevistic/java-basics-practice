package com.assignment.repository;

import com.assignment.model.LibraryStaff;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LibraryStaffRepository implements CrudRepository<LibraryStaff>, SearchRepository<LibraryStaff> {
    private Map<Long, LibraryStaff> libraryStaffMap;
    private long nextId;

    public LibraryStaffRepository() {
        libraryStaffMap = new HashMap<>();
        nextId = 1;
    }

    @Override
    public LibraryStaff create(LibraryStaff libraryStaff) {
        libraryStaff.setId(nextId);
        libraryStaffMap.put(nextId, libraryStaff);
        nextId++;
        return libraryStaff;
    }

    @Override
    public LibraryStaff read(long id) {
        return libraryStaffMap.get(id);
    }

    @Override
    public LibraryStaff update(LibraryStaff updatedLibraryStaff) {
        long id = updatedLibraryStaff.getId();
        if (libraryStaffMap.containsKey(id)) {
            libraryStaffMap.put(id, updatedLibraryStaff);
            return updatedLibraryStaff;
        }
        return null; // Library staff with the given ID does not exist
    }

    @Override
    public void delete(long id) {
        libraryStaffMap.remove(id);
    }

    @Override
    public List<LibraryStaff> search(String keyword) {
        return libraryStaffMap.values()
                .stream()
                .filter(staff -> staff.getName().contains(keyword) || staff.getRole().contains(keyword))
                .collect(Collectors.toList());
    }
}