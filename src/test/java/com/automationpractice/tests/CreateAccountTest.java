package com.automationpractice.tests;

import com.automationpractice.pageObjects.pages.MainPage;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Register Account Test
 *
 * @since Alpha 0.2 2019-12-25
 * @author Adam K.
 */

public class CreateAccountTest {

    private static WebDriver driver; //must be static otherwise below will be null
    MainPage mainPage = new MainPage(driver); // null if above is static

    @BeforeClass
    public static void setupClass() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Before
    public void setupTest() {
        //
    }

    @After
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void testIfCanRegisterAccount() throws InterruptedException {

        //todo navigate to Account Sign In page and register an account
        //todo Asert

        mainPage.
                navigateToMainPage().
                selectSignInLink().
                clickSignInLink().
                selectEmailFormAndTypeUserEmailAddress().
                registerAccount();

    }
}