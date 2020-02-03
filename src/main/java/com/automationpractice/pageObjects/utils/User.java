package com.automationpractice.pageObjects.utils;

public class User {

    //todo Rethink a good data pool.
    //todo Regex for the email address. After succesfull account registration the next test run will fail

    //public static String[] email = {"a@a.pl","unique_address@yopmail.com",};
    public static StringBuilder emailUsername = new StringBuilder("a");
    public static String emailDomain = "a.pl";
    public static String email = emailUsername + "@" + emailDomain;
    public static String[] genderName = {"Female","Male"};
    public static String[] genderNameOneCharacter = {"F","M"};
    public static String[] genderNamePersonalTitle = {"Mrs","Mr"};
    public static String[] personalTitle = {"Mrs","Mr"};
    public static String[] firstNameGeneric = {"Firstname","First"};
    public static String[] lastNameGeneric = {"Lastname","Last"};
    public static String[] firstNameMale = {"Jan","John"};
    public static String[] lastNameMale = {"Kowalski","Doe"};
    public static String[] firstNameFemale = {"Anna","Jane"};
    public static String[] lastNameFemale = {"Kowalska","Doe"};
    public static String[] password = {"pwdQWERTY123!","ASDF!@testpwd"}; //password min. 5 chars
    public static String[] street = {"Street 1","Times Square 1"};
    public static String[] city = {"City","New York"};
    public static String[] state = {"State","New York"};
    public static String[] zipPostcode = {"00-000","00000"};
    public static String[] country = {"Country","USA","United States"};
    public static String[] phoneNumber = {"000000000","123456789","000-000-000"};
    public static String[] aliasDeliveryAddress = {"Home","Work"};

}