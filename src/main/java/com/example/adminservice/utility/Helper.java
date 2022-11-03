package com.example.adminservice.utility;

import java.time.LocalDate;
import java.time.Period;
import java.util.Formatter;

public  class Helper {
    private Helper(){}
    public static int ageCalculator(LocalDate dateOfBirth){
        LocalDate curDate = LocalDate.now();
        if ((dateOfBirth != null) && (curDate != null)) {
            return Period.between(dateOfBirth, curDate).getYears();
        }
        else {
            return 0;
        }
    }

    public static boolean checkAge(LocalDate dateOfBirth){
        return ageCalculator(dateOfBirth)>=18;
    }

    public static String generateMemberId() {
        long number = (long) Math.floor(Math.random() * 9_000_00L) + 1_000_00L;
        try(Formatter formatter = new Formatter()){
            String string = String.valueOf(formatter.format("%,d", number)).replace(",","-");
            return "R-"+string;
        }


        catch (Exception exception){
            return null;
        }


    }
    public static String generateClaimId() {
        long number = (long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L;
        return String.valueOf(number);
    }

}
