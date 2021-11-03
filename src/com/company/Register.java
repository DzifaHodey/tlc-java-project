package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Register {
    private List<Student> studentList;

    public Register(List<Student> students) {
        this.studentList = students;
    }

    public List<String> getRegister(){
        return studentList.stream()
                .map(Student::getName).toList();
    }

    public List<String> getRegisterByLevel(Year year){
        return studentList.stream()
                .filter(student -> student.getYear().equals(year))
                .map(Student::getName).toList();
    }

    public String printReport(){
        Map<Year, List<String>> studentsByLevel = studentList.stream()
                .collect(Collectors.groupingBy(Student::getYear, Collectors.mapping(Student::getName, Collectors.toList())));
        return studentsByLevel.toString();
    }

    public double getHighestGrade(){
        return studentList.stream().flatMap(Student::getGradesAsStream).mapToDouble(grade -> grade).max().orElse(0.0);
    }

    public double getTotalAverageGrade(){
        return studentList.stream().flatMap(Student::getGradesAsStream).mapToDouble(grade -> grade).average().orElse(0.0);
    }

    public List<Double> gradesAbove60(){
        return studentList.stream().flatMap(Student::getGradesAsStream).filter(grade-> grade>60 ).toList();
    }

    public Optional<Student> getStudentByName(String name){
        return studentList.stream().filter(student -> student.getName().equals(name)).findFirst();
    }

    public List<Student> getStudentsByName(List<String> names){
        return studentList.stream().filter(student -> names.contains(student.getName())).toList();

//        List<Student> talkatives = new ArrayList<>();
//        for (Student student : studentList){
//            if (names.contains(student.getName())){
//                talkatives.add(student);
//            }
//        }
//        return talkatives;
    }

    @Override
    public String toString() {
        return "Register{" +
                "studentList=" + studentList +
                '}';
    }
}
