package com.ccm.erp.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Result {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long resultId;
    private String subject;

    @Column(columnDefinition = "INT DEFAULT 100")
    private int totalMarks;
    private int obtainedMarks;

    @OneToOne
    @JoinColumn(name = "rollNo", referencedColumnName = "rollNo")
    private Student student;
}
