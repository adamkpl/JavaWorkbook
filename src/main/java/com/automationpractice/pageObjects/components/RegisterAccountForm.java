package com.automationpractice.pageObjects.components;

import com.automationpractice.pageObjects.pages.AbstractPageObject;
import com.automationpractice.pageObjects.pages.AccountSignInPage;
import com.automationpractice.pageObjects.utils.WaitWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegisterAccountForm extends AbstractPageObject {

    // YOUR PERSONAL INFORMATION

    @FindBy(id = "email_create")
    private WebElement emailAddressField;
    @FindBy(id = "id_gender1")
    private WebElement gender_male;
    @FindBy(id = "id_gender2")
    private WebElement gender_female;
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
    private WebElement addressAlias;

    // OTHER

    @FindBy(name = "SubmitCreate")
    private WebElement createAnAccountButton;
    @FindBy(id = "submitAccount")
    private WebElement registerButton;

    // ERRORS

    @FindBy(id = "create_account_error")
    private WebElement createAnAccountError;

    public RegisterAccountForm(WebDriver driver) {
        super(driver);
    }

    public RegisterAccountForm selectCreateNewAccountEmailAddressField() {
        WaitWrapper.waitForElement(getDriver(),10,emailAddressField);
        return this;
    }

    public RegisterAccountForm setNewAccountEmailAddress(String emailAddress) {
        emailAddressField.clear();
        emailAddressField.sendKeys(emailAddress);
        return this;
    }

    public RegisterAccountForm clickCreateNewAccountButton() {
        //todo Fix error: "An account using this email address has already been registered."
        WaitWrapper.waitForElement(getDriver(),10,createAnAccountButton);
        createAnAccountButton.click();
        return this;
    }

    //todo one setGender method - M or F
    public RegisterAccountForm setGenderMale(String gender) {
        WaitWrapper.waitForElement(getDriver(), 10, gender_male);
        gender_male.click();
        gender_male.isSelected();
        return this;
    }

    public RegisterAccountForm setGenderFemale(String gender) {
        WaitWrapper.waitForElement(getDriver(), 10, gender_female);
        gender_female.click();
        gender_female.isSelected();
        return this;
    }

    public RegisterAccountForm setFirstName(String aFirstName) {
        WaitWrapper.waitForElement(getDriver(), 10, firstName);
        firstName.clear();
        firstName.sendKeys(aFirstName);
        return this;
    }

    public RegisterAccountForm setLastName(String aLastName) {
        WaitWrapper.waitForElement(getDriver(), 10, lastName);
        lastName.clear();
        lastName.sendKeys(aLastName);
        return this;
    }

    public RegisterAccountForm setPassword(String aPassword) {
        WaitWrapper.waitForElement(getDriver(), 10, password);
        password.clear();
        password.sendKeys(aPassword);
        return this;
    }

    public RegisterAccountForm selectDayOfBirth(int dayOfBirth) {
        //todo select by a String
        dobDay = new Select(getDriver().findElement(By.id("days")));
        dobDay.isMultiple();
        dobDay.selectByIndex(dayOfBirth);
        return this;
    }

    public RegisterAccountForm selectMonthOfBirth(int monthOfBirth) {
        //todo select by a String
        dobMonth = new Select(getDriver().findElement(By.id("months")));
        dobMonth.isMultiple();
        dobMonth.selectByIndex(monthOfBirth);
        return this;
    }

    public RegisterAccountForm selectYearOfBirth(int yearOfBirth) {
        //todo select by a String
        dobYear = new Select(getDriver().findElement(By.id("years")));
        dobYear.isMultiple();
        dobYear.selectByIndex(yearOfBirth);
        return this;
    }

    public RegisterAccountForm setAddress(String aAddress) {
        WaitWrapper.waitForElement(getDriver(), 10, address);
        address.clear();
        address.sendKeys(aAddress);
        return this;
    }

    public RegisterAccountForm setCity(String aCity) {
        WaitWrapper.waitForElement(getDriver(), 10, city);
        city.clear();
        city.sendKeys(aCity);
        return this;
    }

    public RegisterAccountForm selectState(int aState) {
        //todo select by String
        state = new Select(getDriver().findElement(By.id("id_state")));
        state.isMultiple();
        state.selectByIndex(aState);
        return this;
    }

    public RegisterAccountForm setPostcode(CharSequence aPostCode) {
        WaitWrapper.waitForElement(getDriver(), 10, postcode);
        postcode.clear();
        postcode.sendKeys(aPostCode);
        return this;
    }

    public RegisterAccountForm selectCountry(int aCountry) {
        //todo select by String
        country = new Select(getDriver().findElement(By.id("id_country")));
        country.isMultiple();
        country.selectByIndex(aCountry);
        return this;
    }
    
    public RegisterAccountForm setMobilePhoneNumber(CharSequence mobilePhoneNumber) {
        //todo consider other data type since a phone number can by typed with non-int characters
        WaitWrapper.waitForElement(getDriver(), 10, phone_mobile);
        phone_mobile.clear();
        phone_mobile.sendKeys(mobilePhoneNumber);
        return this;
    }

    public RegisterAccountForm setAddressAlias(String aAddressAlias) {
        WaitWrapper.waitForElement(getDriver(), 10, addressAlias);
        addressAlias.clear();
        addressAlias.sendKeys(aAddressAlias);
        return this;
    }

    public RegisterAccountForm clickRegisterButton() {
        registerButton.isEnabled();
        registerButton.click();
        return this;
    }

    public AccountSignInPage registerAccount() {
        return new AccountSignInPage(getDriver());
    }
}