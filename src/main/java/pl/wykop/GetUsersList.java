package pl.wykop;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetUsersList {
	public static void main(String[] args) throws StringIndexOutOfBoundsException {

		// Zapytaj o adres znaleziska i o typ listy - Wykopali/Zakopali
		// Przykład: https://www.wykop.pl/link/5873251/do-you-love-me/ & W
		String url = SetUrl.setUrl();

		// Otwórz przeglądarkę. Domyślnie Google Chrome
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// Otwórz stronę, aby wywołać wszystkie okienka pop-up
		driver.get(Url.MAIN_PAGE);

		// Ustaw ciasteczka, które zamkną wszystkie okienka pop-up przy następnej wizycie
		CookieSetter.setCloseAllPopupsCookies(driver);

		// Otwórz stronę znaleziska
		driver.get(url);

		// Wydrukuj całą listę użytkowników na konsoli
		VotesContainer.getVotes(driver);

		// Zamknij przeglądarkę
		driver.quit();
	}
}