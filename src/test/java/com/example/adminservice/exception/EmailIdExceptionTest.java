package com.example.adminservice.exception;


import com.example.adminservice.exceptions.EmailIdException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.mongodb.internal.connection.tlschannel.util.Util.assertTrue;
import static org.assertj.core.api.Assertions.assertThat;

class EmailIdExceptionTest {
    EmailIdException emailIdException = new EmailIdException("error");
    @Test
    void contextLoads() {
        assertTrue(true);
    }

    @Test
    @DisplayName("checking if EmailIdException is loading or not")
    void ClaimIsLoadedOrNot() {
        assertThat(emailIdException).isNotNull();
    }
}
