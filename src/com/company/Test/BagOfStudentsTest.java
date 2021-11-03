package com.company.Test;

import com.company.BagOfStudents;
import com.company.NaughtyStudent;
import com.company.Student;
import com.company.Year;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BagOfStudentsTest {

    Student dave;
    Student joseph;
    BagOfStudents<Student> students;
    @BeforeEach
    void setUp() {
        List<Double> grades2 = List.of(50.0, 50.0, 60.0, 60.0);
        dave = new Student(1122, "Dave", Year.FIRST, grades2);
        joseph = new NaughtyStudent(1121, "Joseph", Year.FIRST, grades2);
        students = new BagOfStudents<>();
    }

    @Test
    void testAddStudent() {
        students.add(dave);
        assertTrue(students.getStudentList().contains(dave));
    }

    @Test
    void removeStudent() {
    }

    @Test
    void removeAllStudents() {
    }
}