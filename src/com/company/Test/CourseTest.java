package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {

    Course introToProgramming;
    Student dave;
    Student joseph;
    @BeforeEach
    void setUp(){
        List<Double> grades2 = List.of(50.0, 50.0, 60.0, 60.0);
        dave = new Student(1122, "Dave", Year.FIRST, grades2);
        joseph = new NaughtyStudent(1121, "Joseph", Year.FIRST, grades2);
        introToProgramming = new Course("Intro To Programming", new Lecturer("sam"), List.of(dave, joseph), Year.FIRST);
    }

    @Test
    void testGetHighestAverageGrade() {
        assertEquals(55.0*1.1, introToProgramming.getHighestAverageGrade());
    }
}