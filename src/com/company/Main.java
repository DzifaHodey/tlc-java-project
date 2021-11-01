package com.company;

import java.security.spec.EllipticCurve;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        // REFACTOR - create list of students,
        // write logic to add students from various years,
        //


        List<Double> grades = List.of(20.50, 67.0, 34.5, 10.0, 98.0);
        List<Double> grades1 = List.of(60.50, 77.0, 84.5, 45.5, 78.0);
        List<Double> grades2 = List.of(50.0, 50.0, 60.0, 60.0);


        Student dzifa = new Student(1120, "Dzifa", Year.FIRST, grades);
        Student joseph = new Student(1121, "Joseph", Year.FIRST, grades);
        Student dave = new Student(1122, "Dave", Year.FIRST, grades);

        Student ama = new Student(2120, "Ama", Year.SECOND, grades);
        Student kofi = new Student(2121, "Kofi", Year.SECOND, grades);
        Student ohene = new Student(2123, "Ohene", Year.SECOND, grades);

        Student yaa = new Student(3133, "Yaa", Year.THIRD, grades2);
        Student kingsley = new Student(3134, "Kingsley", Year.THIRD, grades2);
        Student raymond = new Student(3135, "Raymond", Year.THIRD, grades);

        Student scholastica = new Student(4140, "Scholastica", Year.FOURTH, grades1);
        Student emmanuelina = new Student(4141, "Emmanuelina", Year.FOURTH, grades1);
        Student gwendolyne = new Student(4142, "Gwendolyne", Year.FOURTH, grades1);

        List<Student> students = List.of(scholastica, emmanuelina, gwendolyne, ohene, yaa, kingsley, raymond);

        Lecturer sam = new Lecturer("Sam");
        Lecturer dan = new Lecturer("Dan");
        Lecturer ken = new Lecturer("Ken");

        Course introToProgramming = new Course("Intro To Programming", sam, List.of(dzifa, joseph, dave), Year.FIRST);
        Course advancedGardening = new Course("Advanced Gardening", dan, List.of(yaa, kingsley, raymond, scholastica, emmanuelina, gwendolyne), Year.FOURTH);

        List<Student> fourthYearStartsWithVowel = students.stream().filter(student -> student.getYear() == Year.FOURTH).collect(Collectors.toList());

        Course physics = new Course("Physics", ken, List.of(emmanuelina), Year.FOURTH);

        System.out.println("Dzifa's average grade: " + dzifa.getAverageGrade() + "%");
        System.out.println("Yaa's average grade: " + yaa.getAverageGrade() + "%");
        System.out.println();

        System.out.println("Physics enrolment: " + physics.getStudentList());
        System.out.println("Advanced Gardening enrolment: " + advancedGardening.getStudentList());
        System.out.println("Highest Average Grade for Adv Gardening: " + advancedGardening.getHighestAverageGrade()+ "%");









    }
}
