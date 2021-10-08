package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lecture {
    private List<Student> studentList = new ArrayList<>();

    public void enter(Student student){
        if (!studentList.contains(student)){
            studentList.add(student);
        }
        else System.out.println("Student already enrolled in lecture.");
    }

    public double getHighestAverageGrade(){
        return studentList.stream().mapToDouble(Student::getAverageGrade).max().getAsDouble();

    }

    public List<Student> getStudentList() {
        return studentList;
    }
}
