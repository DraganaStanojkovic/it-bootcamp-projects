package desetidomaci;

import java.util.Random;
import java.util.Scanner;

public class DrugiZadatak {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi n:");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Unesi gornju granicu niza:");
		int gornjaGranica = sc.nextInt();

		generisiNiz(a, gornjaGranica);
		unosBroja(a);
	}

	static void generisiNiz(int[] niz, int gornjaGranica) {
		Random r = new Random();
		for (int i = 0; i < niz.length; i++) {
			int broj = r.nextInt(gornjaGranica);
			niz[i] = broj;
			System.out.println(niz[i]);
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
