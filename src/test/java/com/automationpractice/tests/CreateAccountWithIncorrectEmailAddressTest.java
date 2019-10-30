package com.automationpractice.tests;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;
import static org.openqa.selenium.support.ui.ExpectedConditions.textToBePresentInElementLocated;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Create an account using an invalid email address
 *
 * @version  1.0.0 2019-09-09
 * @author Adam K.
 * @see <a href="https://github.com/bonigarcia/webdrivermanager-examples/blob/master/src/test/java/io/github/bonigarcia/wdm/test/ChromeTest.java">ChromeTest.java</a>
 */
public class CreateAccountWithIncorrectEmailAddressTest {

    private WebDriver driver;

    @BeforeClass
    public static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @Before
    public void setupTest() {
        driver = new ChromeDriver();
        //Resize browser window - Maximize it
        driver.manage().window().maximize();
        //Open URL
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
    }

    @After
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void testIfAccountCanBeCreatedForAnIncorrectEmailAddress() {

        WebDriverWait wait = new WebDriverWait(driver, 15);

        //Look for CREATE AN ACCOUNT form
        By emailInput = By.id("email_create");
        wait.until(presenceOfElementLocated(emailInput));

        //Type an Invalid/Unexpected value
        driver.findElement(emailInput).sendKeys("testIfAccountCanBeCreatedForAnIncorrectEmailInput");

        //Click Create an account button
        By createButton = By.id("SubmitCreate");
        wait.until(elementToBeClickable(createButton));
        driver.findElement(createButton).click();

        //Wait for a warning message
        wait.until(textToBePresentInElementLocated(By.id("create_account_error"),"Invalid email address."));
    }
}