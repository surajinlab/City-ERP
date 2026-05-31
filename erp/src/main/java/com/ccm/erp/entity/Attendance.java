package com.ccm.erp.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Attendance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long attendanceId;
    private String subject;
    private int totalClass;
    private int present;
    private int absent;
    private float percentAttendance;

    @OneToOne
    @JoinColumn(name = "rollNo", referencedColumnName = "rollNo")
    private Student student;
}
