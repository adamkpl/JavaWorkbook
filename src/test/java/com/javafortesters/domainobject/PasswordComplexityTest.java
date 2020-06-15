package com.javafortesters.domainobject;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PasswordComplexityTest {

    Password password = new PasswordComplexity();
    // List a few examples
    // todo Think about implementing a source for good & bad passwords. ENUM class?
    String passwordInvalidAllGuidelinesNotApplied = "a  a";
    String passwordInvalidTooShort = "aaa0";
    String passwordInvalidNoDigits = "aaaaa";
    String passwordInvalidWhiteSpaces = "test 1234";
    String passwordValid = "axax9876";

    @Test
    public void shouldBeRejectedPasswordLessThanMinimumCharsRequired() {
        // given
        password.setPassword(passwordInvalidTooShort);
        // when
        //password.getPassword()
        // then
        assertFalse("Password too short", password.verifyLength(password.getPassword()));
    }

    @Test
    public void shouldBeRejectedPasswordLessThanMinimumDigitsRequired() {
        // given
        password.setPassword(passwordInvalidNoDigits);
        // when
        //password.getPassword()
        // then
        assertFalse("Password does not contain at least 3 digits",
                password.verifyFormatContainsDigits(password.getPassword()));
    }

    @Test
    public void shouldBeRejectedDoesNotAcceptWhiteSpaces() {
        // given
        password.setPassword(passwordInvalidWhiteSpaces);
        // when
        //password.getPassword()
        // then
        assertFalse("Password does not accept white spaces",
                password.verifyFormatDoesNotContainWhiteSpaces(password.getPassword()));
    }

    @Test
    public void shouldBeAcceptedValidPasswordAllCheckupsPerformed() {
        // given
        password.setPassword(passwordValid);
        // when
        //password.getPassword()
        // then
        assertTrue("Password correct & accepted", password.verifyAllRequirements(password.getPassword()));
    }

    @Test
    public void shouldBeRejectedInvalidPasswordAllCheckupsPerformed() {
        // given
        password.setPassword(passwordInvalidAllGuidelinesNotApplied);
        // when
        //password.getPassword()
        // then
        assertFalse("Password incorrect & rejected", password.verifyAllRequirements(password.getPassword()));
    }
}