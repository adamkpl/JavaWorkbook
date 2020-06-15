package com.javafortesters.domainobject;

import java.util.ArrayList;

public class PasswordComplexity extends Password {
    public static final int MIN_LENGTH = 8;
    public static final int MIN_DIGITS = 3;
    public static final int MAX_LENGTH = 100;
    private Boolean passwordIsValid = true;
    private Boolean isValidLength = true;
    private Boolean isValidFormatContainsDigits = true;
    private Boolean isValidWhiteSpacesFree = true;
    //todo More categories? Upper- lower cases? Non-alphanumeric characters (special characters)?

    @Override
    public boolean verifyAllRequirements(String password) {

        ArrayList<Boolean> passwordComplexityRequirementsList = new ArrayList<>();

        // List all requirements that are going to be verified on a given password
        passwordComplexityRequirementsList.add(verifyLength(password));
        passwordComplexityRequirementsList.add(verifyFormatContainsDigits(password));
        passwordComplexityRequirementsList.add(verifyFormatDoesNotContainWhiteSpaces(password));

        // Perform ALL check-ups, all must return true.
        int complexityRequirementsInvalidCount = 0;
        for (Boolean checkupList : passwordComplexityRequirementsList) {
            if (!checkupList) {
                complexityRequirementsInvalidCount++;
            }
        }

       // SUMMARY. If at least 1 checkup returned false then return false
       if (complexityRequirementsInvalidCount > 0) {
           System.out.println("invalidCount: " + complexityRequirementsInvalidCount);
           return !passwordIsValid;
       } else {
           System.out.println("invalidCount: " + complexityRequirementsInvalidCount);
           return passwordIsValid;
       }

    }

    @Override
    public boolean verifyLength(String password) {
        int pwdLength = password.length();

        if (pwdLength<MIN_LENGTH) {
            System.out.println("Password " + password + " is less than " + MIN_LENGTH + " characters long.");
            isValidLength = false;
        }
        if (pwdLength>MAX_LENGTH) {
            System.out.println("Password " + password + " is more than " + MAX_LENGTH + " characters long.");
            isValidLength = false;
        }

        return isValidLength;
    }

    @Override
    public boolean verifyFormatContainsDigits(String password) {
        int pwdLength = password.length();
        int digitCounter = 0;

        // Check if password contains at least MIN_DIGITS
        for (int i = 0; i<pwdLength; i++) {
            if (Character.isDigit(password.charAt(i))) {
                digitCounter++;
            }
        }

        if (digitCounter<MIN_DIGITS) {
            System.out.println("Password " + password + " does not contain at least " + MIN_DIGITS +
                    " digits. Current count: " + digitCounter);
            isValidFormatContainsDigits = false;
        }

        return isValidFormatContainsDigits;
    }

    @Override
    public boolean verifyFormatDoesNotContainWhiteSpaces(String password) {
        if (password.contains(" ")) {
            System.out.println("Password " + password + " contains white spaces.");
            return isValidWhiteSpacesFree = false;
        } else {
            return isValidWhiteSpacesFree = true;
        }
    }

}