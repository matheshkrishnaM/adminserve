package com.example.adminservice.exception;

import com.example.adminservice.exceptions.NameException;
import com.example.adminservice.exceptions.PanNumberException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.mongodb.internal.connection.tlschannel.util.Util.assertTrue;
import static org.assertj.core.api.Assertions.assertThat;

 class PanNumberExceptionTest {
    PanNumberException panNumberException = new PanNumberException("error");
    @Test
    void contextLoads() {
        assertTrue(true);
    }

    @Test
    @DisplayName("checking if PanNumberException is loading or not")
    void ClaimIsLoadedOrNot() {
        assertThat(panNumberException).isNotNull();
    }
}
