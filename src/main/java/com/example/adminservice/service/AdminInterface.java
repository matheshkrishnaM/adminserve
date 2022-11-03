package com.example.adminservice.service;

import com.example.adminservice.entity.Member;
import com.example.adminservice.exceptions.*;
import com.example.adminservice.model.ClaimModel;
import com.example.adminservice.model.MemberModel;
import com.example.adminservice.model.ResponseModel;

public interface AdminInterface {
    Member insert(MemberModel member) throws ContactNumberException, NameException, EmailIdException, AgeException, PanNumberException, DateOfBirthException;
    ResponseModel getAll();
    Member update(MemberModel memberModel) ;
    Member getByEmail(String emailId);

    Member addClaim(ClaimModel claimModel);
    Member deleteMember(String id);
}
