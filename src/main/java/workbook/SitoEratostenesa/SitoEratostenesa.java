package workbook.SitoEratostenesa;

/**
 * www.algorytm.org
 * sito Eratostenesa - poszukiwanie liczb pierwszych
 * (c)2005 Tomasz Lubinski
 */
public class SitoEratostenesa {
	public static void main(String[] args) {
		int i, j, zakres, do_kad;
		int[] tablica = new int[10000];
		System.out.println("Podaj gorny zakres, do ktorego chcesz odnalezc liczby pierwsze\n");
		zakres = Console.readInt("?");
		do_kad = (int) Math.floor(Math.sqrt(zakres));
		//inicjuj tablice
		for (i = 1; i <= zakres; i++) tablica[i] = i;
		//algorytm - sito eratostenesa
		for (i = 2; i <= do_kad; i++) {
			if (tablica[i] != 0) {
				j = i + i;
				while (j <= zakres) {
					tablica[j] = 0;
					j += i;
				}
			}
		}
		//wypisz wynik
		System.out.println("Liczby pierwsze z zakresu od 1 do " + zakres);
		for (i = 2; i <= zakres; i++) if (tablica[i] != 0) System.out.print(i + ", ");
	}
}