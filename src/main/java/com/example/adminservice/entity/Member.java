package com.example.adminservice.entity;

import com.example.adminservice.utility.Constants;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(Constants.ENTITY_MEMBER)
public class Member {
    @Id
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

