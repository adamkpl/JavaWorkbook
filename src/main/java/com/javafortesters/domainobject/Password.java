package com.javafortesters.domainobject;

public abstract class Password {

    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public abstract boolean verifyLength(String password);

    public abstract boolean verifyFormatContainsDigits(String password);

    public abstract boolean verifyFormatDoesNotContainWhiteSpaces(String password);

    public abstract boolean verifyAllRequirements(String password);
}