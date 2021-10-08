package com.company.Test;

import com.company.Student;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Student dzifa;
    @BeforeEach
    public void setupGrades(){
        List<Double> grades = new ArrayList<>();
        for (int i=0; i<5; i++){
            grades.add(25.0);
        }
        grades.add(30.5);
        dzifa = new Student(grades, "Dzifa");
    }


    @Test
    void getAverageGrade() {
        assertEquals(25.92,dzifa.getAverageGrade(), "method does not return the right average value.");
    }
}