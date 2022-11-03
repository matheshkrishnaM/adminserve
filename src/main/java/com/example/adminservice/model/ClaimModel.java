package com.example.adminservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClaimModel {
    private String id;
    private String claimId;
    private String name;
    private LocalDate dob;
    private String dateOfAdmission;
    private String dateOfDischarge;
    private double billAmount;
}
