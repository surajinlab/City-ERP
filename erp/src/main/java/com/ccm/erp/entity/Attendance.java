package com.ccm.erp.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Attendance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long attendanceId;
    private String subject;
    private int totalClass;
    private int present;
    private int absent;
    private float percentAttendance;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "rollNo", referencedColumnName = "rollNo")
    @JsonBackReference
    private Student student;
}
