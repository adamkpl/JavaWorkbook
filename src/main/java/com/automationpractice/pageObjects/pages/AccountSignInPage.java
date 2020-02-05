package com.automationpractice.pageObjects.pages;

import com.automationpractice.pageObjects.components.RegisterAccountForm;
import org.openqa.selenium.WebDriver;

public class AccountSignInPage extends AbstractPageObject {

    private RegisterAccountForm registerAccountForm;

    public AccountSignInPage(WebDriver driver){
        super(driver);
        this.registerAccountForm = new RegisterAccountForm(driver);
    }

    public RegisterAccountForm createAnAccount(){
        return registerAccountForm;
    }

}