package devetidomaci;

import java.util.Scanner;

public class SumaBrojeva {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Uneti n: ");
		int n = sc.nextInt();
		int[] a = new int[n];

		ucitajNiz(a);
		sumaBrojeva(a);
	}

	public static void ucitajNiz(int[] niz) {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < niz.length; i++) {
			System.out.println("Uneti element niza: ");
			niz[i] = sc.nextInt();
		}
	}

	public static void sumaBrojeva(int[] niz) {
		int suma = 0;
		int n = 0, m = niz.length;
		for (int i = n; i < m; i++) {
			suma += niz[i];
		}
		System.out.println("Suma brojeva niza je: " + suma);
	}

}
