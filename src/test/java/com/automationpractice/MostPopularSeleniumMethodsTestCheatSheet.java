package com.automationpractice;

import com.SeleniumWebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.junit.experimental.categories.Category;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static junit.framework.TestCase.*;
import static org.openqa.selenium.support.ui.ExpectedConditions.textToBePresentInElementLocated;

/**
 * Selenium WebDriver: Most Used Selenium Methods - My Personal Cheat Sheet #1
 * @version 0.1 Alpha 2020-04-09
 * @author Adam K.
 */
@Ignore
public class MostPopularSeleniumMethodsTestCheatSheet {

    public static WebDriver driver;

    @BeforeClass
    public static void setupClass() {
        WebDriverManager.chromedriver().setup();
        //WebDriverManager.chromedriver().version("81.0.4044.69"); //79.0.3945.36
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/");
        //driver.manage().timeouts().pageLoadTimeout(40, SECONDS);
        //ChromeOptions options = new ChromeOptions();
        //options.addArguments("--disable-features=VizDisplayCompositor");
        System.out.println("setupClass()");
    }

    @Before
    public void setupTest() {
        //driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("setupTest()");
    }

    @AfterClass
    public static void teardown() {
        if (driver != null) {
            driver.quit();
        }
        System.out.println("teardown()");
    }
    /*
    @After
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
    */
    @Category(SeleniumWebDriver.class)
    @Test
    public void getUrl() {
        driver.get("http://automationpractice.com/index.php");
        assertEquals("URL should be http://automationpractice.com/index.php"
                , "http://automationpractice.com/index.php", driver.getCurrentUrl());
        System.out.println("getUrl()");
    }

    @Category(SeleniumWebDriver.class)
    @Test
    public void getTitle() {
        driver.get("http://automationpractice.com/index.php");
        assertEquals("Title should be 'My Store'", "My Store", driver.getTitle());
        System.out.println("getTitle()");
    }

    @Category(SeleniumWebDriver.class)
    @Test
    public void getPageSource() {
        assertTrue("<!-- Block categories module --> should be present in source code"
                , driver.getPageSource().contains("<!-- Block categories module -->"));
        System.out.println("getPageSource()");
    }

    @Category(SeleniumWebDriver.class)
    @Test
    public void getText() {
        assertEquals("Shopping Cart text attribute should be 'Cart (empty)'"
                , "Cart (empty)", driver.findElement(By.className("shopping_cart")).getText());
        System.out.println("getText()");
    }

    @Category(SeleniumWebDriver.class)
    @Test
    public void getAttribute() {
        assertEquals("getAttribute() = ajax_add_to_cart_button", "Add to cart"
                , driver.findElement(By.className("ajax_add_to_cart_button")).getAttribute("title"));
        System.out.println("getAttribute()");
    }

    @Category(SeleniumWebDriver.class)
    @Test
    public void sendKeysAndSubmit() {
        WebElement searchBox = driver.findElement(By.id("search_query_top"));
        WebElement searchButton = driver.findElement(By.name("submit_search"));
        String alertWarningNoResults = "No results were found for your search";
        By alertWarning = By.xpath("//p[@class='alert alert-warning'][contains(.,'No results were found for your search')]");
        String searchQueryNotFound = "Whatever... I am not going to purchase ANYTHING here! Where is MEN's category?!";
        String searchQueryFound = "Blouse";
        WebDriverWait wait = new WebDriverWait(driver, 10);

        searchBox.clear();
        searchBox.sendKeys(searchQueryNotFound);
        searchButton.submit(); //searchButton.click();
        wait.until(textToBePresentInElementLocated(By.className("heading-counter"),"results have been found"));
        assertTrue("Warning alert is displayed", driver.findElement(By.className("alert-warning")).isDisplayed());
        assertTrue("No results were found message is displayed"
                , driver.findElement(alertWarning).getText().contains(alertWarningNoResults));
        System.out.println("sendKeysAndSubmit()");
    }

    @Category(SeleniumWebDriver.class)
    @Test
    public void selectByValue() {
        driver.get("http://automationpractice.com/index.php?id_product=1&controller=product");
        Select selectByValue = new Select(driver.findElement(By.id("group_1")));
        assertFalse(selectByValue.isMultiple());
        selectByValue.selectByValue("3");
        assertEquals("selectByValue = L", "L", selectByValue.getFirstSelectedOption().getText());
        System.out.println("selectByValue()");
    }

    @Category(SeleniumWebDriver.class)
    @Test
    public void selectByVisibleText() {
        driver.get("http://automationpractice.com/index.php?id_product=1&controller=product");
        Select selectByVisibleText = new Select(driver.findElement(By.id("group_1")));
        assertFalse(selectByVisibleText.isMultiple());
        selectByVisibleText.selectByVisibleText("L");
        assertEquals("selectByVisibleText = L", "L", selectByVisibleText.getFirstSelectedOption().getText());
        System.out.println("selectByVisibleText()");
    }

    @Category(SeleniumWebDriver.class)
    @Test
    public void selectByIndex() {
        driver.get("http://automationpractice.com/index.php?id_product=1&controller=product");
        Select selectByIndex = new Select(driver.findElement(By.id("group_1")));
        assertFalse(selectByIndex.isMultiple());
        selectByIndex.selectByIndex(2);
        assertEquals("selectByIndex = L", "L", selectByIndex.getFirstSelectedOption().getText());
        System.out.println("selectByIndex()");
    }

    @Category(SeleniumWebDriver.class)
    @Test
    public void navigateToThenGoBackAndForward() {
        driver.navigate().to("http://automationpractice.com/index.php?id_category=9&controller=category");
        driver.navigate().back();
        driver.navigate().forward();
        assertEquals("Title should be 'Casual Dresses - My Store'", "Casual Dresses - My Store"
                , driver.getTitle());
        System.out.println("navigateToThenGoBackAndForward()");
    }

    //todo dragAndDrop()
    //todo accept(), dismiss()
    //todo getConnection(); create local mysql server or find one online
    //todo switchTo()
        //ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        //driver.switchTo().window(tabs2.get(1));
        //driver.close();
        //driver.switchTo().window(tabs2.get(0));

}