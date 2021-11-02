package com.company;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NaughtyStudentTest {

    List<Double> grades;
    Student aku;
    @BeforeEach
    void setUp(){
        grades = List.of(20.50, 67.0, 34.5, 10.0, 98.0);
        aku = new NaughtyStudent(001, "Aku", Year.FIRST, grades);
    }

    @Test
    void testGetAverageGrade() {
        assertEquals(46*1.1, aku.getAverageGrade());
        assertNotEquals(46.0, aku.getAverageGrade());
    }

    @Test
    void testIsStudent(){
        assertTrue(aku instanceof Student);
    }
}