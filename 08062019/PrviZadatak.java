package desetidomaci;

import java.util.Scanner;

public class PrviZadatak {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi n:");
		int n = sc.nextInt();
		int[] a = new int[n];

		ucitajNiz(a);
		unosBroja(a);

	}

	static void ucitajNiz(int[] niz) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < niz.length; i++) {
			System.out.println("Unesi element: ");
			niz[i] = sc.nextInt();
		}
	}

	static void unosBroja(int[] niz) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi broj m: ");
		int m = sc.nextInt();
		for (int i = 0; i < niz.length; i++) {
			if (m == niz[i]) {
				System.out.println("Uneti element postoji u nizu.");
			}
		}
	}
}
