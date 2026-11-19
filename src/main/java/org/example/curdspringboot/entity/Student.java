package org.example.curdspringboot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity //This will manage by Spring JPA
public class Student {

    @Id //primary key
    private Long id;

    private String name;
    private int age;
    private String email;
    private String grade;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

//    public Student() {
//    }
//    public Student(String name, int age, String email, String grade) {
//        this.name = name;
//        this.age = age;
//        this.email = email;
//        this.grade = grade;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
