package com.example.adminservice.exception;


import com.example.adminservice.exceptions.DependentException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.mongodb.internal.connection.tlschannel.util.Util.assertTrue;
import static org.assertj.core.api.Assertions.assertThat;

 class DependentExceptionTest {
    DependentException dependentException = new DependentException("error");
    @Test
    void contextLoads() {
        assertTrue(true);
    }

    @Test
    @DisplayName("checking if DependentException is loading or not")
    void ClaimIsLoadedOrNot() {
        assertThat(dependentException).isNotNull();
    }
}
