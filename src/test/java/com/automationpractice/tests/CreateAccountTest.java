package com.automationpractice.tests;

import com.automationpractice.pageObjects.components.LoginForm;
import com.automationpractice.pageObjects.components.NavigationBar;
import com.automationpractice.pageObjects.pages.MainPage;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static junit.framework.TestCase.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Register Account
 *
 * @since Beta 0.1 2019-10-26
 * @author Adam K.
 */

public class CreateAccountTest {

    private WebDriver driver;
    MainPage mainPage = new MainPage(driver);

    @BeforeClass
    public static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @Before
    public void setupTest() {
        driver = new ChromeDriver();

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

        mainPage.navigateToMainPage().
                selectSignInLinkInNavigationBar().
                selectSignInLink();


    }
}