package com.automationpractice.pageObjects.pages;

import com.automationpractice.pageObjects.utils.WaitWrapper;
import static org.junit.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccount extends AbstractPageObject {

    private MyAccount myAccount;

    @FindBy(xpath = "//*[contains(text(),'Welcome to your account.')]")
    private WebElement welcomeMessage;

    public MyAccount(WebDriver driver) {
        super(driver);
    }

    public WebElement getAndAssertWelcomeMessage() {
        WaitWrapper.waitForElement(getDriver(),30,welcomeMessage);
        assertTrue("Welcome to your account string found on MyAccount page",true);
        return welcomeMessage;
    }
}