package com.company.Test;

import com.company.Level;
import com.company.Nameable;
import com.company.Register;
import com.company.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static com.company.Level.HIGH;
import static com.company.Level.LOW;
import static org.junit.jupiter.api.Assertions.*;

class RegisterTest {
    Student dzifa;
    Student richard;
    Student prince;
    Register newRegister;
    @BeforeEach
    void setUp() {
        List<Double> grades = new ArrayList<>();
        for (int i=0; i<5; i++){
            grades.add(25.0);
        }
        grades.add(30.5);
        dzifa = new Student(grades, "Dzifa", HIGH);
        richard = new Student(grades,"Richard", HIGH);
        prince = new Student(grades,"Prince", LOW);
        newRegister = new Register(Arrays.asList(dzifa, richard, prince));
    }

    @Test
    void testGetRegister() {
        List<String> expected = new ArrayList<>(List.of("Dzifa", "Richard"));
        List<String> actual = newRegister.getRegister();
        assertEquals(expected, actual);
    }

    @Test
    void testGetRegisterByLevel(){
        List<String> expected = new ArrayList<>(List.of("Dzifa", "Richard"));
        List<String> actual = newRegister.getRegisterByLevel(HIGH);
        assertEquals(expected, actual);
    }

    @Test
    void testPrintReport(){
        String expectedReport = "{HIGH=[Dzifa, Richard], LOW=[Prince]}";
        String actualReport = newRegister.printReport();
        assertEquals(expectedReport, actualReport);
    }
}