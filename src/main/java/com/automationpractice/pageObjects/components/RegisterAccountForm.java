package com.automationpractice.pageObjects.components;

import com.automationpractice.pageObjects.pages.AbstractPageObject;
import com.automationpractice.pageObjects.pages.AccountSignInPage;
import com.automationpractice.pageObjects.utils.User;
import com.automationpractice.pageObjects.utils.WaitWrapper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterAccountForm extends AbstractPageObject {

    @FindBy(id = "email_create")
    private WebElement emailAddressField;

    //todo translate the entire form page into fields, FindBy elements
    //todo correct naming

    public RegisterAccountForm(WebDriver driver) {
        super(driver);
    }

    //move this method to AccountSignInPage class?
    public AccountSignInPage selectEmailFormAndTypeUserEmailAddress() {
        WaitWrapper.waitForElement(getDriver(),10,emailAddressField);
        emailAddressField.sendKeys(User.EMAIL);
        emailAddressField.click();
        return new AccountSignInPage(getDriver());
    }

}
