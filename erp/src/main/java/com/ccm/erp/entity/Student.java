package com.ccm.erp.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long rollNo;
    private String name;
    private String course;
    private int semester;
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
    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<Attendance> attendance;

    // one student -> result
    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<Result> result;
}