package com.company.Test;

import com.company.Lecture;
import com.company.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class LectureTest {
    Student dzifs;
    Student ebuka;
    Lecture calculusLecture;
    @BeforeEach
    void setUp() {
        calculusLecture = new Lecture();
        dzifs = mock(Student.class);
        when(dzifs.getAverageGrade()).thenReturn(34.5);

        ebuka = mock(Student.class);
        when(ebuka.getAverageGrade()).thenReturn(50.5);

    }

    @Test
    void enter() {
//
//        assertTrue();
    }

    @Test
    void getHighestAverageGrade() {
        calculusLecture.enter(dzifs);
        calculusLecture.enter(ebuka);
        assertEquals(50.5, calculusLecture.getHighestAverageGrade());

    }
}