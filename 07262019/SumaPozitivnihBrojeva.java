package cetvrtidomaci;

import java.util.Scanner;

public class SumaPozitivnihBrojeva {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, i;
		int suma = 0;

		for (i = 1; i <= 5; i++) {
			System.out.println("Unesite " + i + ".broj: ");
			n = sc.nextInt();
			if (n > 0) {
				suma += n;
			} else
				continue;
		}
		System.out.println("Suma unetih pozitivnih brojeva je: " + suma);
	}

}
