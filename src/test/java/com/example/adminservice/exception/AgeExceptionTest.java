package com.example.adminservice.exception;

import com.example.adminservice.exceptions.AgeException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.mongodb.internal.connection.tlschannel.util.Util.assertTrue;
import static org.assertj.core.api.Assertions.assertThat;

class AgeExceptionTest {
    AgeException ageException = new AgeException("error");
    @Test
    void contextLoads() {
        assertTrue(true);
    }

    @Test
    @DisplayName("checking if AgeException is loading or not")
    void ClaimIsLoadedOrNot() {
        assertThat(ageException).isNotNull();
    }

}
