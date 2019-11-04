package com.automationpractice.pageObjects.components;

import com.automationpractice.pageObjects.pages.AbstractPageObject;
import com.automationpractice.pageObjects.pages.AccountSignInPage;
import com.automationpractice.pageObjects.utils.WaitWrapper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavigationBar extends AbstractPageObject {

    @FindBy(partialLinkText = "Sign in")
    private WebElement signInLink;

    public NavigationBar(WebDriver driver) {
        super(driver);
    }

    public AccountSignInPage selectSignInLink() {
        WaitWrapper.waitForElement(getDriver(),10,signInLink);
        signInLink.click();
        //After click, the method should return a new object of a next page the rest of the test will be operated on
        return new AccountSignInPage(getDriver());
    }

}
