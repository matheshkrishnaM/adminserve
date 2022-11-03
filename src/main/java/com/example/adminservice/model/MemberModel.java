package com.example.adminservice.model;


import com.example.adminservice.entity.Claims;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberModel {
    private String id;
    private String name;
    private LocalDate dob;
    private LocalDateTime activationDate;
    private String panNumber;
    private String contactNumber;
    private String emailId;
    private String address;
    private String dependName1;
    private String dependName2;
    private String dependDOB1;
    private String dependDOB2;
    private String country;
    private String state;
    private List<Claims> claimsList;
}
