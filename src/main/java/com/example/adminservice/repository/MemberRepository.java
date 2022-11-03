package com.example.adminservice.repository;

import com.example.adminservice.entity.Member;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MemberRepository extends MongoRepository<Member,String> {
    Member findByEmailId(String emailId);

}
