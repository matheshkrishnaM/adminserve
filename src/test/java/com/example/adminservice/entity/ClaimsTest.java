package com.example.adminservice.entity;

import com.example.adminservice.entity.Claims;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static com.mongodb.internal.connection.tlschannel.util.Util.assertTrue;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

 class ClaimsTest {
    Claims claim=new Claims();
    @Test
    void contextLoads() {
        assertTrue(true);
    }

    @Test
    @DisplayName("checking if Claim Class is loading or not")
    void ClaimIsLoadedOrNot() {
        assertThat(claim).isNotNull();
    }
    @Test
    @DisplayName("Checking every getter and setter of Claim Class")
    void testingClaim() {
        Claims claim=new Claims("R1021","R6870","Mathesh", LocalDate.now(),"20-10-2022","28-10-2022",56879);

        claim.setId("R1021");
        claim.setClaimId("R6870");
        claim.setDob(LocalDate.now());
        claim.setDateOfAdmission("20-10-2022");
        claim.setDateOfDischarge("28-10-2022");
        claim.setBillAmount(56879);


        assertEquals("R1021",claim.getId());
        assertEquals("R6870",claim.getClaimId());
        assertEquals(LocalDate.now(),claim.getDob());
        assertEquals("20-10-2022",claim.getDateOfAdmission());
        assertEquals("28-10-2022",claim.getDateOfDischarge());
        assertEquals(56879,claim.getBillAmount());


    }
}
