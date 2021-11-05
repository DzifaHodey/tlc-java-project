package com.company;

import java.security.spec.EllipticCurve;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        // REFACTOR - create list of students,
        // write logic to add students from various years,
        //


        List<Double> grades = List.of(20.50, 67.0, 34.5, 10.0, 98.0);
        List<Double> grades1 = List.of(60.50, 77.0, 84.5, 45.5, 78.0);
        List<Double> grades2 = List.of(50.0, 50.0, 60.0, 60.0);

        var students = List.of(
            new Student(1120, "Dzifa", Year.FIRST, grades),
            new Student(1121, "Joseph", Year.FIRST, grades),
            new Student(1122, "Dave", Year.FIRST, grades),
            new Student(2120, "Ama", Year.FOURTH, grades),
            new Student(2121, "Kofi", Year.SECOND, grades),
            new Student(2123, "Ohene", Year.SECOND, grades),
            new Student(3133, "Yaa", Year.THIRD, grades2),
            new Student(3134, "Kingsley", Year.THIRD, grades2),
            new Student(3135, "Raymond", Year.THIRD, grades),
            new Student(4140, "Scholastica", Year.FOURTH, grades1),
            new Student(4141, "Emmanuelina", Year.FOURTH, grades1));

        var firstYearStudents = students.stream().filter(student -> student.getYear() == Year.FIRST).toList();
        var secondYearStudents = students.stream().filter(student -> student.getYear() == Year.SECOND).toList();
        var thirdYearStudents = students.stream().filter(student -> student.getYear() == Year.THIRD).toList();
        var fourthYearStudents = students.stream().filter(student -> student.getYear() == Year.FOURTH).toList();

        System.out.println(fourthYearStudents);
        Lecturer sam = new Lecturer("Sam");
        Lecturer dan = new Lecturer("Dan");
        Lecturer ken = new Lecturer("Ken");

        Course introToProgramming = new Course("Intro To Programming", sam, firstYearStudents, Year.FIRST);

        Course advancedGardening = new Course("Advanced Gardening", dan, Stream.of(thirdYearStudents,fourthYearStudents).flatMap(Collection::stream).toList(), Year.FOURTH);

        List<Student> fourthYearStartsWithVowel = fourthYearStudents.stream().filter(student -> "aeiou".contains(student.getName().substring(0,1).toLowerCase())).toList();



        Course physics = new Course("Physics", ken, fourthYearStartsWithVowel, Year.FOURTH);


        System.out.println("Physics enrolment: " + physics.getStudentList());
        System.out.println("Advanced Gardening enrolment: " + advancedGardening.getStudentList());
        System.out.println("Highest Average Grade for Adv Gardening: " + advancedGardening.getHighestAverageGrade()+ "%");

        Register register1 = new Register(students);
        List<String> talkativeList = new ArrayList<>();
        Collections.addAll(talkativeList, "Dzifa", "Yaw", "Akos", "Joseph");
        System.out.println(register1.getStudentsByName(talkativeList));






    }
}
