package com.ccm.erp.entity;

import jakarta.persistence.*;

@Entity
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
    @JoinColumn(name = "rollno", referencedColumnName = "attendanceId")
    private Student student;

    public Long getAttendanceId() {
        return attendanceId;
    }

    public void setAttendanceId(Long attendanceId) {
        this.attendanceId = attendanceId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getTotalClass() {
        return totalClass;
    }

    public void setTotalClass(int totalClass) {
        this.totalClass = totalClass;
    }

    public int getPresent() {
        return present;
    }

    public void setPresent(int present) {
        this.present = present;
    }

    public int getAbsent() {
        return absent;
    }

    public void setAbsent(int absent) {
        this.absent = absent;
    }

    public float getPercentAttendance() {
        return percentAttendance;
    }

    public void setPercentAttendance(float percentAttendance) {
        this.percentAttendance = percentAttendance;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Attendance{" +
                "attendanceId=" + attendanceId +
                ", subject='" + subject + '\'' +
                ", totalClass=" + totalClass +
                ", present=" + present +
                ", absent=" + absent +
                ", percentAttendance=" + percentAttendance +
                ", student=" + student +
                '}';
    }
}
