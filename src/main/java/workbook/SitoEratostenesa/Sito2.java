package workbook.SitoEratostenesa;

import java.util.Arrays;

public class Sito2 {
	public static void main(String[] args) {
		// zakres, czyli maksymalna liczba do której będziemy szukać liczb pierwszych
		int zakres = 100;

		/**
		 * tablica liczb pierwszych
		 * liczbą pierwszą będzie taka liczba n, dla której pierwsze[n] == true
		 */
		boolean[] pierwsze = new boolean[zakres];

		// na początek całą tablicę wypełnimy wartościami true
		Arrays.fill(pierwsze, true);

		// od razu pomijamy liczby 0 i 1, bo na pewno nie są liczbami pierwszymi
		pierwsze[0] = false;
		pierwsze[1] = false;

		for (int i = 2; i < zakres; i++) {

			// analizujemy tylko te liczby, które nie zostały jeszcze wykreślone
			if (pierwsze[i]) {

				// wykreślamy wszystkie wielokrotności liczby i (najmniejsza wielokrotność to i+i)
				for (int j = i + i; j < zakres; j = j + i) {
					pierwsze[j] = false;
				}
			}
		}

		// na koniec wyświetlamy wyniki, czyli tylko te elementy tablicy, które mają wartość true
		for (int i = 0; i < pierwsze.length; i++) {
			if (pierwsze[i]) {
				System.out.println(i);
			}
		}
	}
}