package com.company;

import java.util.ArrayList;
import java.util.List;

public class BagOfLecturers<T> {
    List<T> lecturers = new ArrayList<>();

    public void addLecturer(T newLecturer) {
        lecturers.add(newLecturer);
    }

    public void removeLecturer(T Lecturer) {
        if (lecturers.contains(Lecturer)) {
            lecturers.remove(Lecturer);
        }
        else System.out.println("Lecturer " + Lecturer.toString() + "doesn't exist");
    }
    public void removeAllLecturers() {
        lecturers.clear();
    }

    public List<T> getLecturers() {
        return lecturers;
    }
}
