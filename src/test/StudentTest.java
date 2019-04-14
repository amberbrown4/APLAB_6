package test;

import com.university.*;
import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class StudentTest {
    static Student student;
    static Department department;
    static Professor professor;
    static Course course;


    @BeforeAll
    public static void createStudent() {
        department = new Department("Computer and IT Eng");
        student = new Student("Alireza", "1234", "Software Eng", department);
        professor = new Professor(department, "prof");
        course = new Course("2345", "rrrr", department, professor, 150);
    }

    @Test
    public void testStudentGetName() {
        assertEquals("Alireza", student.getName());
    }

    @Test
    public void testStudentGetCourses() {
        assertNotNull(student.getCourses());
        assertEquals(1, student.getCourses().size());
    }

    @Test
    void getID() {
        assertNotNull(student.getID());
        assertEquals("1234",student.getID());
    }

    @Test
    void getMajor() {
        assertNotNull(student.getMajor());
        assertEquals("Software Eng",student.getMajor());
    }

    @Test
    void getDepartment() {
        assertNotNull(student.getDepartment());
        assertEquals(department,student.getDepartment());
    }

    @Test
    void addCourse() {
        student.addCourse(null);
        assertEquals(0,student.getCourses().size());
        student.addCourse(course);
        assertEquals(1,student.getCourses().size());
    }
}
