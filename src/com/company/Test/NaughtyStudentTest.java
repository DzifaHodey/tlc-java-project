package com.company.Test;

import com.company.Level;
import com.company.NaughtyStudent;
import com.company.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NaughtyStudentTest {

    List<Double> reportedGrades = new ArrayList<>();
    NaughtyStudent ebuka;
    @BeforeEach
    void setUp() {
        reportedGrades.add(3.4);
        reportedGrades.add(30.5);
        ebuka = new NaughtyStudent(reportedGrades, "Ebuka", Level.HIGH);

    }

    @Test
    void testIncreaseAverageGrade() {

    }

    @Test
    void testGetAverageGrade() {
        double expected = Math.round((3.4+30.5)*100.0/2)/100.0;
        double actual = ebuka.getAverageGrade();
        assertNotEquals(expected, actual, "actual value should not be the same as expected average");
        assertEquals((expected*1.10), actual, "actual value should be increased by 10%");
    }

    @Test
    void testNaughtyStudentIsStudent() {
        assertTrue(ebuka instanceof Student);
    }
}