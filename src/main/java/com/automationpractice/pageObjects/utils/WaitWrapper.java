package com.automationpractice.pageObjects.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Wait Wrapper
 *
 * @version 1.0
 * @author LW
 */

public class WaitWrapper {

    public static void waitForElement(WebDriver driver, long timeoutInSeconds , WebElement element){
        WebDriverWait wait = new WebDriverWait(driver,timeoutInSeconds);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}