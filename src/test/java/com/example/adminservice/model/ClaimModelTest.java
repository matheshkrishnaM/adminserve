package com.example.adminservice.model;

import com.example.adminservice.entity.Claims;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static com.mongodb.internal.connection.tlschannel.util.Util.assertTrue;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

 class ClaimModelTest {
    ClaimModel claimModel=new ClaimModel();
    @Test
    void contextLoads() {
        assertTrue(true);
    }

    @Test
    @DisplayName("checking if ClaimModel Class is loading or not")
    void ClaimIsLoadedOrNot() {
        assertThat(claimModel).isNotNull();
    }
    @Test
    @DisplayName("Checking every getter and setter of ClaimModel Class")
    void testingClaim() {
        ClaimModel claimModel=new ClaimModel("R1021","R6870","Mathesh", LocalDate.now(),"20-10-2022","28-10-2022",56879);

        claimModel.setId("R1021");
        claimModel.setClaimId("R6870");
        claimModel.setDob(LocalDate.now());
        claimModel.setDateOfAdmission("20-10-2022");
        claimModel.setDateOfDischarge("28-10-2022");
        claimModel.setBillAmount(56879);


        assertEquals("R1021",claimModel.getId());
        assertEquals("R6870",claimModel.getClaimId());
        assertEquals(LocalDate.now(),claimModel.getDob());
        assertEquals("20-10-2022",claimModel.getDateOfAdmission());
        assertEquals("28-10-2022",claimModel.getDateOfDischarge());
        assertEquals(56879,claimModel.getBillAmount());


    }
}
