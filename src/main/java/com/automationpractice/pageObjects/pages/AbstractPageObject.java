package com.automationpractice.pageObjects.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * POP. Abstract Web Page class with PageFactory.initElements
 *
 * @author Adam K.
 * @version 1.0 2019-10-30
 */

public abstract class AbstractPageObject {

    private WebDriver driver;

    //Constructor. We initialize page elements via PageFactory
    public AbstractPageObject(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    //Method
    public WebDriver getDriver() {
        return driver;
    }

}