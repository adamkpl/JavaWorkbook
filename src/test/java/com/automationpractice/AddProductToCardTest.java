package com.automationpractice;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

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
 * Add 1 item to the cart and verify
 *
 * @version Beta 0.5 2019-09-09
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
    }

    @After
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void testIfAddToCartButtonAddsAProductToCart() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, 15);

        //Resize browser window - Maximize it
        driver.manage().window().maximize();

        //todo Open URL - Cart. Verify if empty.
        //http://automationpractice.com/index.php?controller=order

        //Open URL - Product Page
        driver.get("http://automationpractice.com/index.php?id_product=7&controller=product");

        //Locate Add to cart button on the product page
        By addToCardButton = By.id("add_to_cart");
        wait.until(presenceOfElementLocated(addToCardButton));
        wait.until(elementToBeClickable(addToCardButton));

        //Locate Add to cart button and click it
        driver.findElement(addToCardButton).click();

        //Wait
        Thread.sleep(1500);

        //Look for a pop-up window confirmation "Product successfully added to your shopping cart"
        By productSuccessfullyAddedToCart = By.id("layer_cart");
        driver.findElement(productSuccessfullyAddedToCart);
        wait.until(presenceOfElementLocated(productSuccessfullyAddedToCart));

        //Find Proceed to checkout button, and click it
        By proceedToCheckoutButton = By.linkText("Proceed to checkout");
        driver.findElement(proceedToCheckoutButton);
        wait.until(presenceOfElementLocated(proceedToCheckoutButton));
        wait.until(elementToBeClickable(proceedToCheckoutButton));
        driver.findElement(proceedToCheckoutButton).click();

        //Wait
        Thread.sleep(1500);

        //In Cart. Cart is filled with products
        By shoppingCartContainsXProducts = By.id("summary_products_quantity");
        driver.findElement(shoppingCartContainsXProducts);
        wait.until(presenceOfElementLocated(shoppingCartContainsXProducts));

        if (wait.until(presenceOfElementLocated(shoppingCartContainsXProducts)) != null) {
            System.out.println("OK");
        }

        //todo In Cart. Correct product was added to cart
        //

    }
}