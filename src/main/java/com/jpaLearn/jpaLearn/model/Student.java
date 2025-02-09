package com.jpaLearn.jpaLearn.model;

import java.time.LocalDate;

public class Student {

    private  String firstName;
    private  String lastName;
    private int age;
    private  String email;
    private LocalDate dateOfBirth;




    public Student(String firstName, String lastName, int age, String email, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }
    //empty constructor
    public Student() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
