package com.example.adminservice;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static com.mongodb.internal.connection.tlschannel.util.Util.assertTrue;
import static org.hamcrest.MatcherAssert.assertThat;

@SpringBootTest
class AdminServiceApplicationTests {

	AdminServiceApplication adminServiceApplication;

	@Test
	void contextLoads() {
		assertTrue(true);
	}

	;

	@Test
	void testComponentProcessingMicroserviceApplication() {

		Assertions.assertThat(adminServiceApplication).isNull();


	}
}
