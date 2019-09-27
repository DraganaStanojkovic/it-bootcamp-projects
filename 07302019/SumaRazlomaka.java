package sestipaket;

import java.util.Scanner;

public class SumaRazlomaka {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n, k;
		System.out.println("Unesite broj n: ");
		n = sc.nextDouble();
		System.out.println("Unesite broj k: ");
		k = sc.nextDouble();
		//System.out.println(suma(n, k));
		double x;
		x=suma(n,k);
		System.out.println(x);

	}

	static double suma(double n, double k) {
		double s = 0, g = 0, d=0;
		int i;
		for (i = 0; i <= n; i++) {
			g = i + 1;
			d = k + i;
			s += g / d;
		}
		
		return s;
	}
}