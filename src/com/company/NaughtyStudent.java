package com.company;

import java.util.List;

public class NaughtyStudent extends Student{
    public NaughtyStudent(List<Double> gradesList, String name) {
        super(gradesList,name);
    }

    private double increaseAverageGrade(){
        double naughtyAverage = super.getAverageGrade() * 1.1;
        return naughtyAverage;
    }

    @Override
    public double getAverageGrade() {
        return increaseAverageGrade();
    }
}
