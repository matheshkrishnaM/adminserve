package com.example.adminservice.utility;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

class HelperTest {
    Helper helper;
    @Test
    void contextLoads() {
        assertTrue(true);
    }

    @Test
    void testComponentProcessingMicroserviceApplication() {
        assertThat(helper).isNull();
    }


}
