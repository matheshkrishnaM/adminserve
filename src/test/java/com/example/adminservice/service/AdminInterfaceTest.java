package com.example.adminservice.service;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

 class AdminInterfaceTest {
    AdminInterface adminInterface;
    @Test
    void contextLoads() {
        assertTrue(true);
    }

    @Test
    void testComponentProcessingMicroserviceApplication() {
        assertThat(adminInterface).isNull();
    }
}
