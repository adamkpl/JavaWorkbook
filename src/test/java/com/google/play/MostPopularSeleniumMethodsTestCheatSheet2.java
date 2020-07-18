package com.google.play;

import com.SeleniumWebDriver;
import com.automationpractice.pageObjects.utils.TakeScreenshotWrapper;
import com.automationpractice.pageObjects.utils.WaitWrapper;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.junit.experimental.categories.Category;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

import static junit.framework.TestCase.*;

/**
 * Selenium WebDriver: Most Used Selenium Methods - My Personal Cheat Sheet #2
 * @version 0.1 Alpha 2020-04-11
 * @author Adam K.
 */
@Ignore
public class MostPopularSeleniumMethodsTestCheatSheet2 {

    public static WebDriver driver;

    @BeforeClass
    public static void setupClass() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://play.google.com/store/apps");
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

    @Category(SeleniumWebDriver.class)
    @Test
    public void moveToElement() throws IOException {

        WebDriverWait wait = new WebDriverWait(driver, 5);
        /*
        // Polish
        WebElement playServicesMenuHoverArrow = driver.findElement(By.className("osoUAb")); //random!
        WebElement playServicesMenuMovies = driver.findElement(By.xpath("(//span[contains(.,'Filmy')])[2]"));
        WebElement playServicesMenuMusic = driver.findElement(By.xpath("(//span[contains(.,'Muzyka')])[2]"));
        WebElement playServicesMenuBooks = driver.findElement(By.xpath("(//span[contains(.,'Książki')])[2]"));
        WebElement playServicesMenuEntertainment = driver.findElement(By.xpath("(//span[contains(.,'Rozrywka')])[2]"));
        */

        // Dependent on the region a user is in. Some services are NOT available in some regions.
        WebElement playServicesMenuHoverArrow = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/*/span[1]"));
        WebElement playServicesMenuApps = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/.//ul[1]/li[1]/a[1]/span[1]/span[2]"));
        WebElement playServicesMenuMovies = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/.//ul[1]/li[2]/a[1]/span[1]/span[2]"));
        WebElement playServicesMenuMusic = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/.//ul[1]/li[3]/a[1]/span[1]/span[2]"));
        WebElement playServicesMenuBooks = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/.//ul[1]/li[4]/a[1]/span[1]/span[2]"));
        WebElement playServicesMenuEntertainment = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/.//ul[1]/li[5]/a[1]/span[1]/span[2]"));

        Actions actions = new Actions(driver);

        wait.until(ExpectedConditions.visibilityOf(playServicesMenuHoverArrow));
        actions.moveToElement(playServicesMenuHoverArrow);
        actions.perform();

        // Apps already selected and active.
        /*
        actions.moveToElement(playServicesMenuApps);
        actions.perform();
        assertTrue("Apps menu is displayed", playServicesMenuApps.isDisplayed());
        TakeScreenshotWrapper.takeScreenshot(driver, "apps.png");
        */

        actions.moveToElement(playServicesMenuMovies);
        actions.perform();
        assertTrue("Movies menu is displayed", playServicesMenuMovies.isDisplayed());
        TakeScreenshotWrapper.takeScreenshot(driver, "movies.png");

        actions.moveToElement(playServicesMenuMusic);
        actions.perform();
        assertTrue("Music menu is displayed", playServicesMenuMusic.isDisplayed());
        TakeScreenshotWrapper.takeScreenshot(driver, "music.png");

        actions.moveToElement(playServicesMenuBooks);
        actions.perform();
        assertTrue("Books menu is displayed", playServicesMenuBooks.isDisplayed());
        TakeScreenshotWrapper.takeScreenshot(driver, "books.png");

        actions.moveToElement(playServicesMenuEntertainment);
        actions.perform();
        assertTrue("Entertainment menu is displayed", playServicesMenuEntertainment.isDisplayed());
        TakeScreenshotWrapper.takeScreenshot(driver, "entertainment.png");

        System.out.println("moveToElement()");
    }

}