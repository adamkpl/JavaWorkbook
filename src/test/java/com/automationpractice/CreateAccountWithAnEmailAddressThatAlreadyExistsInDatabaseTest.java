package com.automationpractice;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;
import static org.openqa.selenium.support.ui.ExpectedConditions.textToBePresentInElementLocated;

import com.SeleniumWebDriver;
import com.automationpractice.pageObjects.utils.WaitWrapper;
import org.junit.*;
import org.junit.experimental.categories.Category;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Create an account using an invalid email address
 * Not Page Object Pattern coding!
 * @version  1.0.0 2019-09-09
 * @author Adam K.
 */
@Ignore
public class CreateAccountWithAnEmailAddressThatAlreadyExistsInDatabaseTest{

    private WebDriver driver;

    @BeforeClass
    public static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @Before
    public void setupTest() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
    }

    @After
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
    @Category(SeleniumWebDriver.class)
    @Test
    public void testIfAccountCanBeCreatedWhenEmailAlreadyExistsInDatabase(){
        //WebDriverWait wait = new WebDriverWait(driver, 10);

        // Look for CREATE AN ACCOUNT form
        By emailInput = By.id("email_create");
        //wait.until(presenceOfElementLocated(emailInput));

        // Type a@a.pl (already exists in database)
        driver.findElement(emailInput).sendKeys("a@a.pl");

        // Click Create an account button
        By createButton = By.id("SubmitCreate");
        //wait.until(elementToBeClickable(createButton));
        driver.findElement(createButton).click();

        // Wait for a warning message
        driver.findElement(By.id("create_account_error"));
        //wait.until(textToBePresentInElementLocated(By.id("create_account_error"),"An account using this email address has already been registered."));
    }
}