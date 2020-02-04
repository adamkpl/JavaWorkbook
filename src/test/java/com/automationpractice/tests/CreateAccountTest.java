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
 * @since Alpha 0.5 2020-02-03
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
            driver.quit();
        }
    }

    @Test
    public void testIfCanRegisterAccount() throws InterruptedException {

        //When
        accountSignInPage.
                createAnAccount().
                    selectCreateNewAccountEmailAddressField().
                    setRandomlyGeneratedNewAccountEmailAddress().
                    clickCreateNewAccountButton().
                    setGenderMale("gendermale").
                    setFirstName("Adam").
                    setLastName("Kowalski").
                    setPassword("pwdQWERTY123!").
                    selectDayOfBirth(1).
                    selectMonthOfBirth(1).
                    selectYearOfBirth(1).
                    setAddress("Street 1").
                    setCity("City").
                    selectState(1).
                    setPostcode("12345").
                    selectCountry(1).
                    setMobilePhoneNumber("123456789").
                    setAddressAlias("Home").
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