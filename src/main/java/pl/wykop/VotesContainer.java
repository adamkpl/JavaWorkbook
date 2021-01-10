package pl.wykop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class VotesContainer {
	public static void getVotes(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);

		WebElement votesContainer = driver.findElement(By.id(PageObject.VOTES_CONTAINER));
		wait.until(ExpectedConditions.visibilityOf(votesContainer));

		List<WebElement> allUsers = driver.findElements(By.xpath(PageObject.USERS_LIST));

		// Wydrukuj całą listę na konsoli
		System.out.println("Ilość użytkowników na liście: \n" + allUsers.size());
		System.out.println("---------------UŻYTKOWNICY---------------");

		for (WebElement list : allUsers) {
			System.out.println("@" + list.getText());
		}
		System.out.println("------------------KONIEC-----------------");
	}
}