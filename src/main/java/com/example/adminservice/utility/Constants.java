package com.example.adminservice.utility;

public class Constants {
    private Constants(){

    }
    //General
    public static final String SUCCESS = "Success";
    public static final String FAILURE = " Failure";

    public static final String ENTITY_MEMBER ="Member";

    //Controller
    public static final String INSERT_MEMBER = "/insert";
    public static final String GET_ALL_MEMBERS = "/get/all/members";
    public static final String DELETE_ALL_MEMBERS = "delete/all/members/{id}";
    public static final String UPDATE_MEMBER = "/update/member";
    public static final String GET_BY_EMAIL_ID = "get/by/email/{emailId}";
    public static final String ADD_DEPENDENT = "/add/dependent";
    public static final String UPDATE_DEPENDENT = "/update/dependent";
    public static final String CROSS_ORIGIN = "*";
    public static final String REQUEST_MAPPING = "member";
    public static final String ADD_CLAIM = "/add/claim";

    //Name Exception
    public static final String NAME_REGEX = "^[A-Za-z][A-Za-z. ]{2,31}$";
    public static final String NAME_EMPTY = "Name cannot be empty.";
    public static final int NAME_MIN_LENGTH = 2;
    public static final int NAME_MAX_LENGTH = 32;
    public static final String NAME_MINIMUM_LENGTH = "Length of the name must be greater than 2 Characters at least.";
    public static final String NAME_MAXIMUM_LENGTH = "Length of the name must be lesser than 32 Characters.";
    public static final String NAME_INVALID_INPUT = "Invalid Name Input";
    public static final String NAME_IS_NULL = "Name cannot be null";


    public static final int OK = 200;
    public static final String NULL = null;

    //Contact Number Exception
    public static final String CONTACT_NUMBER_REGEX = "[0-9]{10}";
    public static final String CONTACT_NUMBER_INVALID_INPUT = "Contact Number must contain only numericals and the length must be exactly 10";
    public static final String CONTACT_NUMBER_IS_NULL = "Contact Number cannot be null";
    public static final String CONTACT_NUMBER_IS_EMPTY = "Contact Number cannot be Empty";


    //Email ID Exception
    public static final String EMAIL_REGEX = "[a-zA-Z0-9_+&*-]+(?:\\."+"[a-zA-Z0-9_+&*-]+)*@"+"(?:[a-zA-Z0-9-]+\\.)+[a-z"+"A-Z]{2,7}$";
    public static final String EMAIL_ID_INVALID_INPUT ="Invalid Email Input";
    public static final String EMAIL_ID_IS_NULL = "PAN Number cannot be null";
    public static final String EMAIL_ID_IS_EMPTY = "PAN Number cannot be Empty";

    //PAN NUMBER EXCEPTION
    public static final String PAN_REGEX = "[A-Z0-9]{12}";
    public static final String PAN_NUMBER_INVALID_INPUT="Invalid Pan Number Input";
    public static final String PAN_NUMBER_IS_NULL = "PAN Number cannot be null";
    public static final String PAN_NUMBER_IS_EMPTY = "PAN Number cannot be Empty";


    //AGE EXCEPTION
    public static final int AGE = 18;
    public static final String AGE_IS_LESS_THAN_18 = "Age is lesser than 18";
    public static final String DOB_GREATER_THAN_SYSTEM_DATE = "Date of birth cannot be greater than current date";

    //Dependent Exception
    public static final String DEPENDENT_EXCEPTION = "Already reached maximum number of Dependents";
    public static final int MAX_DEPENDENT_NUMBER = 2;
    public static final String DEPENDENT_ID_NOT_FOUND_EXCEPTION = "Dependent Id not Found";
    public static final String DEPENDENT_NO_LONGER_EXIST = "The dependent account no longer exist";


}
