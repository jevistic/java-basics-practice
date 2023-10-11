package com.assignment.model;

public class LibraryStaff extends AbstractEntity {
    private String staffId;
    private String name;
    private String role;

    public LibraryStaff() {
    }

    public LibraryStaff(String staffId, String name, String role) {
        this.staffId = staffId;
        this.name = name;
        this.role = role;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}