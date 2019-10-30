package com.automationpractice.pageObjects.components;

import com.automationpractice.pageObjects.pages.AbstractPageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavigationBar extends AbstractPageObject {

    @FindBy(partialLinkText = "Sign in")
    private WebElement signInLink;

    public NavigationBar(WebDriver driver) {
        super(driver);
    }

    public NavigationBar selectSignInLink() {
        signInLink.click();
        return new NavigationBar(getDriver()); //why?
    }

}
