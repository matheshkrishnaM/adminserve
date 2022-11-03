package com.example.adminservice.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static com.mongodb.internal.connection.tlschannel.util.Util.assertTrue;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

 class ResponseModelTest {
    ResponseModel responseModel=new ResponseModel();
    @Test
    void contextLoads() {
        assertTrue(true);
    }

    @Test
    @DisplayName("checking if ResponseModel Class is loading or not")
    void ClaimIsLoadedOrNot() {
        assertThat(responseModel).isNotNull();
    }
    @Test
    @DisplayName("Checking every getter and setter of ResponseModel Class")
    void testingClaim() {
        ResponseModel responseModel=new ResponseModel(400,"Success","Failure","mathesh");

        responseModel.setCode(400);
        responseModel.setStatus("Success");
        responseModel.setError("Failure");
        responseModel.setMembers("mathesh");



        assertEquals(400,responseModel.getCode());
        assertEquals("Success",responseModel.getStatus());
        assertEquals("Failure",responseModel.getError());
        assertEquals("mathesh",responseModel.getMembers());
      ;


    }
}
