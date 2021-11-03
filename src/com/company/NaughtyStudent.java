package com.company;

import java.util.List;

public class NaughtyStudent extends Student{
    public NaughtyStudent(int studentId, String name, Year year, List<Double> gradesList) {
        super(studentId, name, year, gradesList);
    }

    @Override
    public double getAverageGrade() {
        return super.getAverageGrade()*1.1;
    }
}
