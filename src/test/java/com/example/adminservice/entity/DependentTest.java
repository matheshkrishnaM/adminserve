package com.example.adminservice.entity;

import com.example.adminservice.entity.Dependent;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static com.mongodb.internal.connection.tlschannel.util.Util.assertTrue;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

 class DependentTest {
    Dependent dependent=new Dependent();
    @Test
    void contextLoads() {
        assertTrue(true);
    }

    @Test
    @DisplayName("checking if  Dependent Class is loading or not")
    void ClaimIsLoadedOrNot() {
        assertThat(dependent).isNotNull();
    }
    @Test
    @DisplayName("Checking every getter and setter of  Dependent Class")
    void testingClaim() {
        Dependent dependent=new Dependent("R1021","Mathesh", LocalDate.now());

        dependent.setDependentId("R1021");
        dependent.setName("Mathesh");
        dependent.setDob(LocalDate.now());



        assertEquals("R1021",dependent.getDependentId());
        assertEquals("Mathesh",dependent.getName());
        assertEquals(LocalDate.now(),dependent.getDob());



    }
}
