package com.automationpractice.pageObjects.components;

import com.automationpractice.pageObjects.pages.AbstractPageObject;
import com.automationpractice.pageObjects.pages.AccountSignInPage;
import com.automationpractice.pageObjects.utils.User;
import com.automationpractice.pageObjects.utils.WaitWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.automationpractice.pageObjects.utils.User.*;
import static org.junit.Assert.assertFalse;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class RegisterAccountForm extends AbstractPageObject {

    // YOUR PERSONAL INFORMATION

    @FindBy(id = "id_gender1")
    private WebElement gender_male;
    @FindBy(id = "id_gender2")
    private WebElement gender_female;
    @FindBy(id = "email_create")
    private WebElement emailAddressField;
    @FindBy(id = "customer_firstname")
    private WebElement firstName;
    @FindBy(id = "customer_lastname")
    private WebElement lastName;
    @FindBy(id = "passwd")
    private WebElement password;
    @FindBy(id = "days")
    private Select dobDay; //local var below
    @FindBy(id = "months")
    private Select dobMonth; //local var below
    @FindBy(id = "years")
    private Select dobYear; //local var below

    // YOUR ADDRESS

    @FindBy(id = "address1")
    private WebElement address;
    @FindBy(id = "city")
    private WebElement city;
    @FindBy(id = "id_state")
    private Select state; //local var below
    @FindBy(id = "postcode")
    private WebElement postcode;
    @FindBy(id = "id_country")
    private Select country; //local var below
    @FindBy(id = "phone_mobile")
    private WebElement phone_mobile;
    @FindBy(id = "alias")
    private WebElement alias;

    // OTHER

    @FindBy(name = "SubmitCreate")
    private WebElement createAnAccountButton;
    @FindBy(id = "submitAccount")
    private WebElement registerButton;
    @FindBy(id = "create_account_error")
    private WebElement createAnAccountError;

    int iterate = 0;
    WebDriverWait wait = new WebDriverWait(getDriver(), 10);

    public RegisterAccountForm(WebDriver driver) {
        super(driver);
    }

    public AccountSignInPage registerAccount()
    {
        //todo Better implementation for User data. Enums?
        //todo Polish it! Clean up the code. Smarter!

        WaitWrapper.waitForElement(getDriver(), 10, emailAddressField);
        emailAddressField.sendKeys(User.email);
        createAnAccountButton.click();

        do
        {
            if (wait.until(textToBePresentInElementLocated(By.id("create_account_error"), "An account using this email address has already been registered.")))
            {
                int nextIteration = iterate++;

                email = emailUsername.append(nextIteration) + "@" + emailDomain;

                wait.until(elementToBeClickable(emailAddressField));
                emailAddressField.clear();
                emailAddressField.sendKeys(email);

                createAnAccountButton.click();
            }
        }
        while (wait.until(textToBePresentInElementLocated(By.id("create_account_error"), "An account using this email address has already been registered.")));
        {
            // no statements here as intended.
        }

        WaitWrapper.waitForElement(getDriver(), 10, gender_male);
        gender_male.click();
        firstName.sendKeys(User.firstNameGeneric[0]);
        lastName.sendKeys(User.lastNameGeneric[0]);
        password.sendKeys(User.password[0]);

        //todo Smarter method of writing these Selects
        dobDay = new Select(getDriver().findElement(By.id("days")));
            assertFalse(dobDay.isMultiple());
        dobDay.selectByIndex(1);
        dobMonth = new Select(getDriver().findElement(By.id("months")));
            assertFalse(dobMonth.isMultiple());
        dobMonth.selectByIndex(1);
        dobYear = new Select(getDriver().findElement(By.id("years")));
            assertFalse(dobYear.isMultiple());
        dobYear.selectByIndex(30);
        address.sendKeys(User.street[0]);
        city.sendKeys(User.city[0]);
        state = new Select(getDriver().findElement(By.id("id_state")));
            assertFalse(state.isMultiple());
        state.selectByIndex(1);
        postcode.sendKeys(User.zipPostcode[1]);
        country = new Select(getDriver().findElement(By.id("id_country")));
            assertFalse(country.isMultiple());
        country.selectByIndex(1);
        phone_mobile.sendKeys(User.phoneNumber[0]);
        alias.clear();
        alias.sendKeys(User.aliasDeliveryAddress[0]);
        registerButton.click();
        return new AccountSignInPage(getDriver());
    }
}