package pl.wykop;

import java.util.Scanner;

public class SetUrl {
	public static String setUrl() throws StringIndexOutOfBoundsException {

		System.out.print("Podaj URL: ");
		Scanner userInput = new Scanner(System.in);
		String url = userInput.nextLine();

		// URL powinien zawierać składnię: https://www.wykop.pl/link/5873251
		verifyLinkPrefixIsOK(url);
		verifyLinkIDisOK(url);

		System.out.print("Wykopali / Zakopali [W/Z]: ");
		Scanner voteBury = new Scanner(System.in);
		String prefix = voteBury.nextLine();

		try {
			if (prefix.substring(0, 1).equalsIgnoreCase("w")) {
				return url + "#voters";
			} else if (prefix.substring(0, 1).equalsIgnoreCase("z")) {
				return url + "#votersBury";
			} else {
				System.out.println("Brak poprawnej odpowiedzi [W]ykopali lub [Z]akopali. Wybieram opcję domyślną: [W]ykopali");
				return url + "#voters";
			}
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Brak poprawnej odpowiedzi [W]ykopali lub [Z]akopali. Wybieram opcję domyślną: [W]ykopali");
			return url + "#voters";
		}

	}

	private static void verifyLinkPrefixIsOK(String urlLinkPrefix) {
		if (!urlLinkPrefix.contains(Url.MAIN_PAGE + "link/")) {
			System.out.println("URL niepoprawny. URL powinien zaczynać się od https://www.wykop.pl/link/. Uruchom ponownie aplikację.");
			System.exit(0);
		}

	}

	private static void verifyLinkIDisOK(String urlLinkPrefix) throws StringIndexOutOfBoundsException {
		try {
			if (!urlLinkPrefix.substring(26, 33).matches("\\d{7}")) {
				System.out.println("URL niepoprawny. URL powinien zawierać ID znaleziska (wyłącznie 7 cyfr) np. https://www.wykop.pl/link/5873251. Uruchom ponownie aplikację.");
				System.exit(0);
			}
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("URL niepoprawny. URL powinien zawierać ID znaleziska (wyłącznie 7 cyfr) np. https://www.wykop.pl/link/5873251. Uruchom ponownie aplikację.");
			System.exit(0);
		}

	}

}