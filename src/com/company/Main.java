package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        List<Double> grades = new ArrayList<>();
        grades.add(33.5);
        grades.add(36.5);
        grades.add(67.0);
        Lecture biology = new Lecture();
        Student dzifa = new Student(grades, "dzifa");

        List<Double> grades2 = new ArrayList<>();
        grades2.add(44.5);
        grades2.add(2.9);
        grades2.add(6.0);
        Student richard = new Student(grades2, "Richard");
        biology.enter(dzifa);
        biology.enter(richard);
        System.out.println(biology.getStudentList().stream().mapToDouble(Student::getAverageGrade).max().getAsDouble());
    }
}
