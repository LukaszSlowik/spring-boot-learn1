package com.jpaLearn.jpaLearn.model;

import java.time.LocalDate;

public class Student {

    private  String firstName;
    private  String lastName;
    private  String email;
    private LocalDate dateOfBirth;
    private int age;




    public Student(String firstName, int age, LocalDate dateOfBirth, String email, String lastName) {
        this.firstName = firstName;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.lastName = lastName;
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
