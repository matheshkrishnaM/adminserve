package com.example.adminservice.utility;

import com.example.adminservice.exceptions.AgeException;
import com.example.adminservice.exceptions.ContactNumberException;
import com.example.adminservice.exceptions.DateOfBirthException;
import com.example.adminservice.exceptions.EmailIdException;
import com.example.adminservice.exceptions.NameException;
import com.example.adminservice.exceptions.PanNumberException;
import com.example.adminservice.model.MemberModel;

import java.time.LocalDate;

public class Validation {
    private Validation(){}

    public static void validateMember(MemberModel member)
            throws ContactNumberException, NameException, EmailIdException,
            PanNumberException,AgeException,DateOfBirthException {
        validateName(member.getName());
        member.setName(member.getName().trim());

        validateContactNumber(member.getContactNumber());
        member.setContactNumber(member.getContactNumber().trim());

        validateEmailId(member.getEmailId());
        member.setEmailId(member.getEmailId().trim());

        validatePanNumber(member.getPanNumber());
        member.setPanNumber(member.getPanNumber().trim());

        validateAge(member.getDob());

    }

    private static void validateName(String name) throws NameException{
        if(name.equals(Constants.NULL)){
            throw new NameException(Constants.NAME_IS_NULL);
        }
        else{
            name = name.trim();
        }

        if(name.isEmpty()){
            throw new NameException(Constants.NAME_EMPTY);
        }
        else if(name.length()<=Constants.NAME_MIN_LENGTH){
            throw new NameException(Constants.NAME_MINIMUM_LENGTH);
        }
        else if(name.length()>Constants.NAME_MAX_LENGTH){
            throw new NameException(Constants.NAME_MAXIMUM_LENGTH);
        }

        else if(!name.matches(Constants.NAME_REGEX)){
            throw new NameException(Constants.NAME_INVALID_INPUT);
        }

    }
    private static void validateContactNumber(String contactNumber) throws ContactNumberException {
        if(contactNumber.equals(Constants.NULL)){
            throw new ContactNumberException(Constants.CONTACT_NUMBER_IS_NULL);
        }
        else {
            contactNumber=contactNumber.trim();
        }
        if(contactNumber.isEmpty()){
            throw new ContactNumberException(Constants.CONTACT_NUMBER_IS_EMPTY);
        }

        else if(!contactNumber.matches(Constants.CONTACT_NUMBER_REGEX)){
            throw  new ContactNumberException(Constants.CONTACT_NUMBER_INVALID_INPUT);
        }

    }

    private static void validateEmailId(String emailId) throws EmailIdException{
        if(emailId.equals(Constants.NULL)){
            throw new EmailIdException(Constants.EMAIL_ID_IS_NULL);
        }
        else{
            emailId=emailId.trim();
        }
        if(emailId.isEmpty()){
            throw new EmailIdException(Constants.EMAIL_ID_IS_EMPTY);
        }
        else if(!emailId.matches(Constants.EMAIL_REGEX)){
            throw new EmailIdException(Constants.EMAIL_ID_INVALID_INPUT);

        }
    }

    private static void validatePanNumber(String panNumber) throws PanNumberException, EmailIdException {
        if(panNumber.equals(Constants.NULL)){
            throw new PanNumberException(Constants.PAN_NUMBER_IS_NULL);
        }
        else{
            panNumber = panNumber.trim();
        }
        if(panNumber.isEmpty()){
            throw new PanNumberException(Constants.PAN_NUMBER_IS_EMPTY);
        }
        else if(!panNumber.matches(Constants.PAN_REGEX)){
            throw new EmailIdException(Constants.PAN_NUMBER_INVALID_INPUT);
        }
    }
    private static void validateAge(LocalDate dateOfBirth) throws AgeException,DateOfBirthException{
        validateDateOfBirth(dateOfBirth);
        if(!Helper.checkAge(dateOfBirth)){
            throw new AgeException(Constants.AGE_IS_LESS_THAN_18);
        }
    }


    private static void validateDateOfBirth(LocalDate dateOfBirth) throws DateOfBirthException {
        if(dateOfBirth.compareTo(LocalDate.now())>0){
            throw new DateOfBirthException(Constants.DOB_GREATER_THAN_SYSTEM_DATE);
        }
    }
}
