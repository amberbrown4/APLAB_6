package com.university;

import javax.print.attribute.standard.NumberUp;
import java.util.ArrayList;

public class Student {
    private String name;
    private String ID;
    private String major;
    private Department department;
    ArrayList<Course> courses;
    public Student(String name, String ID, String major, Department department) {
        this.name = name;
        this.ID = ID;
        this.major = major;
        this.department = department;
        courses =  new ArrayList<Course>();
    }

    public String getName() {
        return name;
    }

    public String getID() {
        return this.ID;
    }

    public String getMajor() {
        return major;
    }

    public Department getDepartment() {
        return department;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void addCourse(Course course){
        if(course != null) {
            courses.add(course);
        }
    }
}
