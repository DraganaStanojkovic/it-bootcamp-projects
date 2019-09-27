package trecidomaci;

import java.util.Scanner;

public class NajvecaCifraUBroju {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, max = 0;
		System.out.println("Unesite broj N: ");
		n = sc.nextInt();
		int x = n;

		while (n > 0) {
			int c = n % 10;
			n /= 10;
			if (c == 9) {
				max = c;
				break;
			} else if (c > max) {
				max = c;
			}
		}
		System.out.println("Najveca cifra broja " + x + " je: " + max);

	}

}
