package com.ccm.erp.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long rollNo;
    private String name;
    private String course;
    private String gender;
    private LocalDate dob;
    private long phone;
    private String email;
    private String parentName;
    private LocalDate admissionDate;
    private String city;
    private String state;
    private String address;
    private String university;

    // one student -> attendance
    @OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
    private Attendance attendance;
}