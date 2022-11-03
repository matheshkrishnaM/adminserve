package com.example.adminservice.model;

import com.example.adminservice.entity.Dependent;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static com.mongodb.internal.connection.tlschannel.util.Util.assertTrue;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

 class DependentModelTest {
    DependentModel dependentModel=new DependentModel();
    @Test
    void contextLoads() {
        assertTrue(true);
    }

    @Test
    @DisplayName("checking if DependentModel Class is loading or not")
    void ClaimIsLoadedOrNot() {
        assertThat(dependentModel).isNotNull();
    }
    @Test
    @DisplayName("Checking every getter and setter of DependentModel Class")
    void testingClaim() {
        DependentModel dependentModel=new DependentModel("R2034","R1021","Mathesh", LocalDate.now());
        dependentModel.setId("R2034");
        dependentModel.setDependentId("R1021");
        dependentModel.setName("Mathesh");
        dependentModel.setDob(LocalDate.now());


        assertEquals("R2034",dependentModel.getId());
        assertEquals("R1021",dependentModel.getDependentId());
        assertEquals("Mathesh",dependentModel.getName());
        assertEquals(LocalDate.now(),dependentModel.getDob());



    }
}
