package com.company;

import java.util.ArrayList;
import java.util.List;

public class BagOfStudents<S extends Student> extends Bag<S> {
    List<S> studentList = new ArrayList<>();

    @Override
    public void add(S newStudent) {
        studentList.add(newStudent);
    }

    @Override
    public void remove(S student) {
        if (studentList.contains(student)) {
            studentList.remove(student);
        }
    }

    public void removeAll() {
        studentList.clear();
    }

    public List<S> getStudentList() {
        return studentList;
    }
}