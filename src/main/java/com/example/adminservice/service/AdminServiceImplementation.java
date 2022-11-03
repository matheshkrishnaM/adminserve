package com.example.adminservice.service;

import com.example.adminservice.exceptions.*;
import com.example.adminservice.utility.Constants;
import com.example.adminservice.utility.Helper;
import com.example.adminservice.utility.Validation;
import com.example.adminservice.entity.Claims;
import com.example.adminservice.entity.Member;
import com.example.adminservice.model.ClaimModel;
import com.example.adminservice.model.MemberModel;
import com.example.adminservice.model.ResponseModel;
import com.example.adminservice.repository.MemberRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class AdminServiceImplementation implements AdminInterface {

    @Autowired
    MemberRepository memberRepository;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public Member insert(@RequestBody MemberModel member) throws ContactNumberException, NameException,
            EmailIdException, AgeException, PanNumberException,DateOfBirthException {
        member.setActivationDate(LocalDateTime.now());
        Validation.validateMember(member);

        if(member.getClaimsList()==null){
            member.setClaimsList(new ArrayList<>());
        }
        member.setId(Helper.generateMemberId());
        Member member1 = modelMapper.map(member,Member.class);
        return memberRepository.save(member1);

    }

    @Override
    public ResponseModel getAll(){
        return  new ResponseModel(Constants.OK,Constants.SUCCESS,Constants.NULL,memberRepository.findAll());
    }


    public Member deleteMember(String id){
        Optional<Member> mem = memberRepository.findById(id);
        if(mem.isPresent()){
            return mem.get();
        }
        else{
            return new Member();
        }

    }
    @Override
    public Member update(@RequestBody MemberModel memberModel){
        Optional<Member> fetchedMember = memberRepository.findById(memberModel.getId());
        if(fetchedMember.isPresent()){
            Member member = fetchedMember.get();

            List<Claims> claimsList = new ArrayList<>(member.getClaimsList());
            member = modelMapper.map(memberModel,Member.class);
            member.setClaimsList(claimsList);
            return memberRepository.save(member);
        }
        return null;
    }

    @Override
    public Member getByEmail(@PathVariable String emailId){
        return memberRepository.findByEmailId(emailId);
    }


    @Override
    public Member addClaim(ClaimModel claimModel) {
        Optional<Member> fetchedMember = memberRepository.findById(claimModel.getId());
        if(fetchedMember.isPresent()){
            Member member = fetchedMember.get();
            List<Claims> claimsList = member.getClaimsList();
            if(member.getClaimsList()==null){
                member.setClaimsList(new ArrayList<>());
            }
            claimsList.add(modelMapper.map(claimModel,Claims.class));
            int size = member.getClaimsList().size();
            member.getClaimsList().get(size-1).setClaimId(Helper.generateClaimId());
            return memberRepository.save(member);
        }

        return null;
    }

}
