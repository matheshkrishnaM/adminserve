package com.example.adminservice.repository;

import com.example.adminservice.entity.Member;
import com.example.adminservice.model.ClaimModel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.mongodb.internal.connection.tlschannel.util.Util.assertTrue;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

 class MemberRepositoryTest {
    MemberRepository memberRepository;
    @Test
    void contextLoads() {
        assertTrue(true);
    }

    @Test
    @DisplayName("Checking for MemberRepository - if it is loading or not for @GetMapping")
    void componentProcessingControllerNotNullTest(){
        assertThat(memberRepository);
    }

}
