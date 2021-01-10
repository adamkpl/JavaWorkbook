package pl.wykop;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

import java.util.Date;

public class CookieSetter {
	public static void setCloseAllPopupsCookies(WebDriver driver) {
		// To pozamyka wszystkie wyskakujące okna pop-up
		driver.manage().addCookie(new Cookie("close_cookies", "1", "wykop.pl", "/", new Date(2524604400000L)));
		driver.manage().addCookie(new Cookie("close_popup_register", "2", "wykop.pl", "/", new Date(2524604400000L)));
		driver.manage().addCookie(new Cookie("euconsent-v2", "whateva", "wykop.pl", "/", new Date(2524604400000L)));
	}
}