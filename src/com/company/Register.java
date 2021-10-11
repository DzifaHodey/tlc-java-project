package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Register {
    List<Student> nameables;


    public Register(List<Student> nameables) {
        this.nameables = nameables;
    }

    public List<String> getRegister(){
        return nameables.stream()
                .map(Nameable::getName).toList();
    }

    public List<String> getRegisterByLevel(Level newLevel){
        return nameables.stream()
                .filter(student -> student.getLevel().equals(newLevel))
                .map(Student::getName).toList();
    }

    public String printReport(){
        Map<Level, List<String>> studentsByLevel = nameables.stream()
                .collect(Collectors.groupingBy(Student::getLevel, Collectors.mapping(Student::getName, Collectors.toList())));
        return studentsByLevel.toString();
    }
}
