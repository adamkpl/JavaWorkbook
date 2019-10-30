package com.automationpractice.pageObjects.pages;

import com.automationpractice.pageObjects.components.NavigationBar;
import com.automationpractice.pageObjects.utils.Url;
import org.openqa.selenium.WebDriver;

public class MainPage extends AbstractPageObject {

    private NavigationBar navigationBar;

    public MainPage(WebDriver driver) {
        super(driver);
        this.navigationBar = new NavigationBar(driver); //why? why here?
    }

    public MainPage navigateToMainPage() {
        getDriver().manage().window().maximize();
        getDriver().get(Url.url);
        return this;
    }

    public NavigationBar selectSignInLinkInNavigationBar() {
        System.out.println(navigationBar);
        return navigationBar;
    }

}
