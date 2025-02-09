package com.jpaLearn.jpaLearn.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {
    @Id
    @GeneratedValue
    private Integer id;
@Column(nullable = false, unique = true)
    private String identifier;
@Column(nullable = false)
    private  String firstname;
@Column(nullable = false)
    private  String lastname;
@Column(nullable = false, unique = true)
    private  String email;
    private LocalDate birthdate;
@Enumerated(EnumType.STRING)
    private  EmployeeRole role;
}
