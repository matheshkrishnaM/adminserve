package com.example.adminservice.exception;

import com.example.adminservice.exceptions.EmailIdException;
import com.example.adminservice.exceptions.NameException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.mongodb.internal.connection.tlschannel.util.Util.assertTrue;
import static org.assertj.core.api.Assertions.assertThat;

 class NameExceptionTest {
    NameException nameException = new NameException("error");
    @Test
    void contextLoads() {
        assertTrue(true);
    }

    @Test
    @DisplayName("checking if NameException is loading or not")
    void ClaimIsLoadedOrNot() {
        assertThat(nameException).isNotNull();
    }
}
