package sestipaket;

import java.util.Scanner;

public class Minimum {

	public static void main(String[] args) {

		int min, n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Koliko brojeva zelite da unesete: ");
		n = sc.nextInt();
		min = minBrojeva(n);
		System.out.println("Minimalni broj je: " + min);
	}

	static int minBrojeva(int n) {
		int x, i;
		int mini = 0;
		for (i = 1; i <= n; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Unesite " + i + ". broj");
			x = sc.nextInt();
			if (i == 1) {
				mini = x;
			} else if (n < mini) {
				mini = x;
			}

		}
		return mini;
	}
}
