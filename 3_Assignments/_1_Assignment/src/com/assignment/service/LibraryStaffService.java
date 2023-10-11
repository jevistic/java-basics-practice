package com.assignment.service;

import com.assignment.model.LibraryStaff;
import com.assignment.repository.LibraryStaffRepository;

import java.util.List;

public class LibraryStaffService implements CrudService<LibraryStaff>, SearchService<LibraryStaff> {
    private LibraryStaffRepository staffRepository;

    public LibraryStaffService(LibraryStaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    @Override
    public LibraryStaff create(LibraryStaff staff) {
        return staffRepository.create(staff);
    }

    @Override
    public LibraryStaff read(long id) {
        return staffRepository.read(id);
    }

    @Override
    public LibraryStaff update(LibraryStaff staff) {
        return staffRepository.update(staff);
    }

    @Override
    public void delete(long id) {
        staffRepository.delete(id);
    }

    @Override
    public List<LibraryStaff> search(String keyword) {
        return staffRepository.search(keyword);
    }
}
