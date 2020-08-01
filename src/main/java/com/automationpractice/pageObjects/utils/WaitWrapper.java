package com.automationpractice.pageObjects.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.function.Function;

public class WaitWrapper {

    public static void waitForElement(WebDriver driver, long timeoutInSeconds, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitForElement(WebDriver driver, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitFluentlyForElement(WebDriver driver, By by) { //By by
        // Source: https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/support/ui/FluentWait.html
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(15)) // had to be modified
                .pollingEvery(Duration.ofSeconds(2)) // had to be modified
                .ignoring(NoSuchElementException.class);

        //wait.until(ExpectedConditions.visibilityOf(webElement)); // This always fails

        WebElement element = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(by);
            }
        });

    }

}