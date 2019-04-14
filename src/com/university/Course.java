package com.university;

import java.util.ArrayList;

public class Course {
    private String ID;
    private String name;
    private Department department;
    private Professor professor;
    private int credit = 0;
    ArrayList<Student> students;

    public Course(String ID, String name, Department department, Professor professor, int credit) {
        this.ID = ID;
        this.name = name;
        this.department = department;
        this.professor = professor;
        this.credit = credit;
        students = new ArrayList<Student>();
    }

    public String getID(){
        return ID;
    }

    public Department getDepartment(){
        return department;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public Professor getProfessor() {
        return professor;
    }

    public int getCredit() {
        return credit;
    }

    public void enrollStudent(Student student){
        if(student.getDepartment().equals(department)){
            students.add(student);
        }
    }

}
