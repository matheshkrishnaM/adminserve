package com.example.adminservice.controller;

import com.example.adminservice.utility.Constants;
import com.example.adminservice.entity.Member;
import com.example.adminservice.model.ClaimModel;
import com.example.adminservice.model.MemberModel;
import com.example.adminservice.model.ResponseModel;
import com.example.adminservice.service.AdminInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(Constants.REQUEST_MAPPING)
@CrossOrigin(Constants.CROSS_ORIGIN)
public class MemberController {

    @Autowired
    AdminInterface adminInterface;

    @PostMapping(Constants.INSERT_MEMBER)
    public ResponseModel insert(@RequestBody MemberModel member){
        try{
            return new ResponseModel(Constants.OK, Constants.SUCCESS,Constants.NULL,adminInterface.insert(member));

        }
        catch (Exception exception) {
            return new ResponseModel(Constants.OK,Constants.FAILURE, exception.getMessage(),Constants.NULL);
        }
    }

    @GetMapping(Constants.GET_ALL_MEMBERS)
    public ResponseModel getAll(){
        return adminInterface.getAll();
    }

    @GetMapping(Constants.GET_ALL_MEMBERS+"/{id}")
    public ResponseModel delete(@PathVariable String id){

        return new ResponseModel(Constants.OK, Constants.SUCCESS,
                Constants.NULL,adminInterface.deleteMember(id));
    }



    @PutMapping(Constants.UPDATE_MEMBER)
    public ResponseModel updateMember(@RequestBody MemberModel memberModel){
        try{
            return new ResponseModel(Constants.OK, Constants.SUCCESS,
                    Constants.NULL,adminInterface.update(memberModel));
        }
        catch (Exception exception){
            return new ResponseModel(Constants.OK,Constants.FAILURE,
                    exception.getMessage(),Constants.NULL);

        }
    }

    @GetMapping(Constants.GET_BY_EMAIL_ID)
    public Member getByEmail(@PathVariable String emailId){
        return adminInterface.getByEmail(emailId);
    }



    @PostMapping(Constants.ADD_CLAIM)
    public Member addClaim(@RequestBody ClaimModel claimModel){
        return adminInterface.addClaim(claimModel);
    }

}
