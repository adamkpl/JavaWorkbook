package workbook.SitoEratostenesa;

import java.util.Scanner;

public class Sito {
	public static void main(String[] args) {
		int n, i, j;
		Scanner klaw = new Scanner(System.in);
		System.out.print("n = ");
		n = klaw.nextInt();
		if (n < 2) System.out.println("Brak liczb pierwszych w podanym zakresie");
		else {
			boolean[] skr = new boolean[n + 1];
			for (i = 2; i <= n; i++) skr[i] = false;
			i = 1;
			do {
				i++;
				if (!skr[i]) {
					j = i * i;
					while (j <= n) {
						skr[j] = true;
						j += i;
					}
				}
			} while (i * i <= n);
			for (i = 2; i <= n; i++) if (!skr[i]) System.out.printf("%10d", i);
		}
	}
}