package part2.entity;


import part2.entity.Exam;

import java.io.Serializable;
import java.util.ArrayList;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;
    int id;
    Integer age;
    ArrayList<Exam> exams;

    public Student(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.exams = new ArrayList<Exam>();
    }

    public ArrayList<Exam> getExams() {
        return exams;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Integer getAge() {
        return age;
    }

}
