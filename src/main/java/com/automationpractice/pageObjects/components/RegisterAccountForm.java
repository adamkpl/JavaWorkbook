package com.automationpractice.pageObjects.components;

import com.automationpractice.pageObjects.pages.AbstractPageObject;
import com.automationpractice.pageObjects.pages.AccountSignInPage;
import com.automationpractice.pageObjects.utils.User;
import com.automationpractice.pageObjects.utils.WaitWrapper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
    //todo dropdown menus for DoB
    @FindBy(id = "days")
    private WebElement dobDay;
    @FindBy(id = "months")
    private WebElement dobMonth;
    @FindBy(id = "years")
    private WebElement dobYear;

    // YOUR ADDRESS

    @FindBy(id = "address1")
    private WebElement address;
    @FindBy(id = "city")
    private WebElement city;
    @FindBy(id = "id_state")
    private WebElement state;
    @FindBy(id = "postcode")
    private WebElement postcode;
    @FindBy(id = "id_country")
    private WebElement country;
    @FindBy(id = "phone_mobile")
    private WebElement phone_mobile;
    @FindBy(id = "alias")
    private WebElement alias;

    // OTHER

    @FindBy(name = "SubmitCreate")
    private WebElement createAnAccountButton;
    @FindBy(id = "submitAccount")
    private WebElement registerButton;

    //todo translate the entire form page into FindBy, WebElement fields-elements
    //todo dropdown menus for certain WebElements
    //todo correct naming

    public RegisterAccountForm(WebDriver driver) {
        super(driver);
    }
    
    public AccountSignInPage registerAccount() {
        WaitWrapper.waitForElement(getDriver(),10,emailAddressField);
        emailAddressField.sendKeys(User.EMAIL);
        //emailAddressField.click();
        createAnAccountButton.click();

        WaitWrapper.waitForElement(getDriver(),10,gender_male);
        gender_male.click();
        firstName.sendKeys("FirstName");
        lastName.sendKeys("FirstName");
        password.sendKeys("asdfQWERTY!@");

/*      dobDay.getFirstSelectedOption();
        dobMonth.;
        dobYear.;
*/
        address.sendKeys("Streetname");
        city.sendKeys("Cityname");

//      state.

        postcode.sendKeys("00000");

//      country.

//      phone_mobile.

        alias.sendKeys("Home");

        return new AccountSignInPage(getDriver());
    }

}
