package com.ccm.erp.dto;

import lombok.Data;

@Data
public class StudentDTO {

    private Long id;

    private String name;

    private String email;

    private String course;

    private String department;

    private String sessionYear;
}