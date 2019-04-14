package com.university;

import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.PrimitiveIterator;

public class Professor {
    private Department department;
    private String name;
    private ArrayList<Course> courses;
    public Professor(Department department, String name) {
        this.department = department;
        this.name = name;
        courses = new ArrayList<Course>();
    }

    public Department getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }
}
