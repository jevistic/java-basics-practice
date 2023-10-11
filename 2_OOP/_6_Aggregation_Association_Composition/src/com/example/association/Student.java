package com.example.association;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int studentId;
    private String name;
    private List<Course> courses; // Association

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void enrollInCourse(Course course) {
        courses.add(course);
        course.addStudent(this); // Bidirectional association
    }

    public List<Course> getCourses() {
        return courses;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }
}