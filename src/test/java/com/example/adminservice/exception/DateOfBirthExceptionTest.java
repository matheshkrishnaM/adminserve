package com.example.adminservice.exception;

import com.example.adminservice.exceptions.DateOfBirthException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.mongodb.internal.connection.tlschannel.util.Util.assertTrue;
import static org.assertj.core.api.Assertions.assertThat;

 class DateOfBirthExceptionTest {
    DateOfBirthException dateOfBirthException = new DateOfBirthException("error");
    @Test
    void contextLoads() {
        assertTrue(true);
    }

    @Test
    @DisplayName("checking if DateOfBirthException is loading or not")
    void ClaimIsLoadedOrNot() {
        assertThat(dateOfBirthException).isNotNull();
    }
}
