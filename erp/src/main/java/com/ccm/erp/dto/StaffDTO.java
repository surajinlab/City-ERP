package com.ccm.erp.dto;

import lombok.Data;

@Data
public class StaffDTO {

    private Long id;

    private String name;

    private String email;

    private String department;

    private String designation;
}