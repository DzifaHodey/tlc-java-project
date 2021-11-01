package com.company;

import java.util.List;

public class Student {

    private int studentId;
    private String name;
    private Year year;
    private List<Double> gradesList;

    public Student(int studentId, String name, Year year, List<Double> gradesList) {
        this.studentId = studentId;
        this.name = name;
        this.year = year;
        this.gradesList = gradesList;
    }

    public String getName() {
        return name;
    }

    public Year getYear() {
        return year;
    }

    public double getAverageGrade(){
        return gradesList.stream().mapToDouble(grade -> grade).average().orElse(0.0);
    }


}
