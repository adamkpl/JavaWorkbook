package com.automationpractice;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static junit.framework.TestCase.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Add 1 item to the cart and verify
 *
 * @since Beta 0.6 2019-09-10
 * @author Adam K.
 * @see <a href="https://github.com/bonigarcia/webdrivermanager-examples/blob/master/src/test/java/io/github/bonigarcia/wdm/test/ChromeTest.java">ChromeTest.java</a>
 */

public class AddProductToCardTest {

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
    }

    @After
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void testIfAddToCartButtonAddsAProductToCart() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, 30);

        //Open URL - Cart. Verify if empty.
        driver.get("http://automationpractice.com/index.php?controller=order");
        By cartIsEmpty = By.cssSelector(".alert-warning"); //"Your shopping cart is empty." todo make it better, there can be different warning messages, and this one can be one of many
        wait.until(presenceOfElementLocated(cartIsEmpty));
        driver.findElement(cartIsEmpty);
        assertTrue("Step1. Shopping cart was empty.",driver.findElement(cartIsEmpty).isDisplayed());

        //Open URL - Product Page
        driver.get("http://automationpractice.com/index.php?id_product=7&controller=product");

        //Locate Add to cart button on the product page and click it
        By addToCardButton = By.id("add_to_cart");
        wait.until(presenceOfElementLocated(addToCardButton));
        wait.until(elementToBeClickable(addToCardButton));
        driver.findElement(addToCardButton).click();

        //Look for a pop-up window confirmation "Product successfully added to your shopping cart"
        By productSuccessfullyAddedToCart = By.id("layer_cart");
        wait.until(presenceOfElementLocated(productSuccessfullyAddedToCart));
        driver.findElement(productSuccessfullyAddedToCart);

        //Find Proceed to checkout button, and click it
        By proceedToCheckoutButton = By.linkText("Proceed to checkout");
        wait.until(presenceOfElementLocated(proceedToCheckoutButton));
        wait.until(elementToBeClickable(proceedToCheckoutButton));
        driver.findElement(proceedToCheckoutButton).click();

        //Cart. Cart is NOT empty
        By shoppingCartContainsXProducts = By.id("summary_products_quantity");
        wait.until(presenceOfElementLocated(shoppingCartContainsXProducts));
        driver.findElement(shoppingCartContainsXProducts);
        assertTrue("Step2. Shopping cart is NOT empty.",driver.findElement(shoppingCartContainsXProducts).isDisplayed());

        //todo In Cart. Correct product was added to cart
        //

    }
}