package com.company;

public class Lecturer {

    private String name;

    public Lecturer(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "name='" + name + '\'' +
                '}';
    }
}
