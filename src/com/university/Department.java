package com.university;

import java.util.ArrayList;

public class Department {

    private String name;
    private ArrayList<Student> students;
    private ArrayList<Course> courses;
    private ArrayList<Professor> professors;

    public Department(String name) {
        this.name = name;
        students = new ArrayList<Student>();
        courses = new ArrayList<Course>();
        professors = new ArrayList<Professor>();
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student student) {
        if (student.getDepartment() == this) {
            students.add(student);
        }
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void removeStudent(Student student) {
        if (student.getDepartment() == this) {
            students.remove(student);
        }
    }

    public void addCourse(Course course) {
        if (course.getDepartment() == this) {
            courses.add(course);
        }
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void removeCourse(Course course) {
        if (course.getDepartment() == this) {
            courses.remove(course);
        }
    }

    public void addProfessor(Professor professor) {
        if (professor.getDepartment() == this) {
            professors.add(professor);
        }
    }

    public ArrayList<Professor> getProfessors() {
        return professors;
    }

    public void removeProfessor(Professor professor) {
        if (professor.getDepartment() == this) {
            professors.remove(professor);
        }
    }

}
