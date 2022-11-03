package com.example.adminservice.controller;

import com.example.adminservice.AdminServiceApplication;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static com.mongodb.internal.connection.tlschannel.util.Util.assertTrue;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

@SpringBootTest
class MemberControllerTest {
	AdminServiceApplication adminServiceApplication;
	@Autowired
	MemberController memberController;
	@Test
	void contextLoads() {
		assertTrue(true);
	}

	@Test
	@DisplayName("Checking for member Controller - if it is loading or not for @GetMapping")
	void componentProcessingControllerNotNullTest(){
		assertThat(memberController).isNotNull();
	}


}
