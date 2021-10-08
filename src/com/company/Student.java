package com.company;

import java.util.List;

public class Student implements Nameable{
    private List<Double> gradesList;
    private String name;

    public Student(List<Double> gradesList, String name) {
        this.gradesList = gradesList;
        this.name = name;
    }

    public double getAverageGrade(){
//        double average = (gradesList.stream().mapToDouble(value -> value).sum())/gradesList.size();
        double average = gradesList.stream().mapToDouble(value -> value).average().orElse(0.0);
        return Math.round(average*100.00)/100.00;
    }


    @Override
    public String getName() {
        return name;
    }
}
