package com.automationpractice.tests;

import com.automationpractice.pageObjects.pages.AccountSignInPage;
import com.automationpractice.pageObjects.pages.MainPage;
import com.automationpractice.pageObjects.pages.MyAccount;
import org.junit.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Register Account Test
 *
 * @since Alpha 0.5 2020-02-05
 * @author Adam K.
 */

public class CreateAccountTest {

    private static WebDriver driver;

    MainPage mainPage = new MainPage(driver);
    AccountSignInPage accountSignInPage = new AccountSignInPage(driver);
    MyAccount myAccount = new MyAccount(driver);

    @BeforeClass
    public static void setupClass() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Before
    public void setupTest() {
        //Given
        navigateToAccountSignInPage();
    }

    @After
    public void teardown() {
        if (driver != null) {
            driver.close();
            driver.quit();
        }
    }

    @Test
    public void testIfCanRegisterAccount() throws InterruptedException {

        //When
        accountSignInPage.
                createAnAccount().
                    selectCreateNewAccountEmailAddressField().
                    setRandomEmailAddress().
                    clickCreateNewAccountButton().
                    setRandomGender().
                    setRandomFirstName().
                    setRandomLastName().
                    setRandomPassword().
                    selectRandomDayOfBirth().
                    selectRandomMonthOfBirth().
                    selectRandomYearOfBirth().
                    setRandomAddress().
                    setRandomUSACity().
                    selectRandomState().
                    setRandomPostcode().
                    selectRandomCountry().
                    setRandomMobilePhoneNumber().
                    setRandomAddressAlias().
                    clickRegisterButton();

        //Then
        myAccount.
                getWelcomeMessage();

    }

    private void navigateToAccountSignInPage(){
        mainPage.
                navigateToMainPage().
                selectSignInLink().
                clickSignInLink();
    }

}