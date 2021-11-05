package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Course {

    private String name;
    private Lecturer lecturer;
    private List<Student> studentList;
    private Year year;

    public Course(String name, Lecturer lecturer, List<Student> studentList, Year year) {
        this.name = name;
        this.lecturer = lecturer;
        this.studentList = studentList;
        this.year = year;
    }

    public List<String> getStudentList() {
        return this.studentList.stream().map(student -> student.getName()).collect(Collectors.toList());
    }

    public void enterStudent(Student student){
        studentList.add(student);
    }

    public double getHighestAverageGrade(){
        return studentList.stream().mapToDouble(Student::getAverageGrade).max().getAsDouble();
    }
}
