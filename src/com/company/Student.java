package com.company;

import java.util.List;

public class Student implements Nameable, HasLevel{
    private List<Double> gradesList;
    private String name;
    private final Level level;

    public Student(List<Double> gradesList, String name, Level level) {
        this.gradesList = gradesList;
        this.name = name;
        this.level = level;
    }

    public double getAverageGrade(){
//        double average = (gradesList.stream().mapToDouble(value -> value).sum())/gradesList.size();
        double average = gradesList.stream()
                .mapToDouble(value -> value)
                .average().orElse(0.0);
        return Math.round(average*100.00)/100.00;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public Level getLevel() {
        return this.level;
    }
}
