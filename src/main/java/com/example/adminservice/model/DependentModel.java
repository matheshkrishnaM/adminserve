package com.example.adminservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DependentModel{
    private String id;
    private String dependentId;
    private String name;
    private LocalDate dob;
}