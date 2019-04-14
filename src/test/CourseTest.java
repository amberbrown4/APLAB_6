package test;

import com.university.Course;
import com.university.Department;
import com.university.Professor;
import com.university.Student;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {
    static Student student;
    static Department department;
    static Professor professor;
    static Course course;


    @BeforeAll
    public static void createCourse() {
        department = new Department("Computer and IT Eng");
        student = new Student("Alireza", "1234", "Software Eng", department);
        professor = new Professor(department, "prof");
        course = new Course("2345", "rrrr", department, professor, 150);
    }

    @Test
    void getID() {
        assertNotNull(course.getID());
        assertEquals("2345",course.getID());
    }

    @Test
    void getDepartment() {
        assertNotNull(course.getDepartment());
        assertEquals(department,course.getDepartment());
    }

    @Test
    void getName() {
        assertNotNull(course.getName());
        assertEquals("rrrr",course.getName());

    }

    @Test
    void getProfessor() {
        assertNotNull(course.getProfessor());
        assertEquals(professor,course.getProfessor());
    }

    @Test
    void enrollStudent() {
        course.enrollStudent(null);
        assertEquals(0,course.getStudents().size());
        course.enrollStudent(student);
        assertEquals(1,course.getStudents().size());
    }
}