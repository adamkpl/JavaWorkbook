package com.automationpractice.tests;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static junit.framework.TestCase.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Add any item to the cart and verify if cart not empty
 * Not Page Object Pattern coding!
 * @since Beta 0.7 2019-09-16
 * @author Adam K.
 */

public class AddProductToCartTest {

    private WebDriver driver;

    @BeforeClass
    public static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @Before
    public void setupTest() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void testIfAddToCartButtonAddsProductToCart(){

        WebDriverWait wait = new WebDriverWait(driver, 10);

        // Open Cart page. Should be empty.
        driver.get("http://automationpractice.com/index.php?controller=order");
        By cartIsEmpty = By.xpath(("//*[contains(text(),'Your shopping cart is empty')]"));
        wait.until(presenceOfElementLocated(cartIsEmpty));
        driver.findElement(cartIsEmpty);
        assertTrue("Step 1. Shopping cart is empty.",driver.findElement(cartIsEmpty).isDisplayed());

        // Open a sample Product Page - product_7_34_0_0, SKU demo_7
        driver.get("http://automationpractice.com/index.php?id_product=7&controller=product");

        // Locate Add to cart button on the product page and click it
        By addToCardButton = By.id("add_to_cart");
        wait.until(presenceOfElementLocated(addToCardButton));
        wait.until(elementToBeClickable(addToCardButton)); //if not = product unavailable for purchase
        driver.findElement(addToCardButton).click();

        // Look for a pop-up window confirmation "Product successfully added to your shopping cart"
        By productSuccessfullyAddedToCart = By.id("layer_cart");
        wait.until(presenceOfElementLocated(productSuccessfullyAddedToCart));
        driver.findElement(productSuccessfullyAddedToCart);

        // Find Proceed to checkout button, and click it
        By proceedToCheckoutButton = By.linkText("Proceed to checkout");
        wait.until(presenceOfElementLocated(proceedToCheckoutButton));
        wait.until(elementToBeClickable(proceedToCheckoutButton));
        driver.findElement(proceedToCheckoutButton).click();

        // Cart is NOT empty
        By shoppingCartContainsXProducts = By.id("summary_products_quantity");
        wait.until(presenceOfElementLocated(shoppingCartContainsXProducts));
        driver.findElement(shoppingCartContainsXProducts);
        assertTrue("Step2. Shopping cart is NOT empty.",driver.findElement(shoppingCartContainsXProducts).isDisplayed());

        // Product was added the cart correctly
        By product_7_34_0_0 = By.id("product_7_34_0_0");
        wait.until(presenceOfElementLocated(product_7_34_0_0));
        driver.findElement(product_7_34_0_0);
        assertTrue("product_7_34_0_0 is present in the Cart",driver.findElement(product_7_34_0_0).isDisplayed());
    }
}