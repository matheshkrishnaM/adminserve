package com.example.adminservice.exception;

import com.example.adminservice.exceptions.AgeException;
import com.example.adminservice.exceptions.ContactNumberException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.mongodb.internal.connection.tlschannel.util.Util.assertTrue;
import static org.assertj.core.api.Assertions.assertThat;

 class ContactNumberExceptionTest {
    ContactNumberException contactNumberException = new ContactNumberException("error");
    @Test
    void contextLoads() {
        assertTrue(true);
    }

    @Test
    @DisplayName("checking if ContactNumberException is loading or not")
    void ClaimIsLoadedOrNot() {
        assertThat(contactNumberException).isNotNull();
    }
}
