package com.company;

import java.util.ArrayList;

public class BagOfStudents<T> {
    ArrayList<T> studentList = new ArrayList<>();

    public void addStudent(T newStudent){
        if (!studentList.contains(newStudent)){
            studentList.add(newStudent);
        } else System.out.println("Student already exists.");
    }

    public void removeStudent(T student){
        if (studentList.contains(student)){
            studentList.remove(student);
        }
    }

    public void removeAllStudents(){
        studentList.clear();
    }


}
