package devetidomaci;

import java.util.Scanner;

public class FunkcijeNizovi {

	public static void main(String[] args) {
		// koliènik zbira èlanova i broja èlanova skupa
		Scanner sc = new Scanner(System.in);

		System.out.println("Uneti n: ");
		int n = sc.nextInt();
		int[] a = new int[n];

		ucitajNiz(a);
		artSredina(a);
		sortirajNiz(a);
		medijana(a);

	}

	public static void ucitajNiz(int[] niz) {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < niz.length; i++) {
			System.out.println("Uneti element niza: ");
			niz[i] = sc.nextInt();
		}
	}

	public static void artSredina(int[] niz) {
		Scanner sc = new Scanner(System.in);
		double suma = 0;
		for (int i = 0; i < niz.length; i++) {
			suma += niz[i];
		}
		double artSrd = suma / (niz.length);
		System.out.printf("Aritmeticka sredina: %.5f\n", artSrd);
	}
	
	static void sortirajNiz(int[] niz) {
		for (int i = 0; i < niz.length - 1; i++) {
			for (int j = i + 1; j < niz.length; j++) {
				if (niz[j] < niz[i]) {
					int temp = niz[j];
					niz[j] = niz[i];
					niz[i] = temp;
					}
			}
		}
		
	}
	
	static void medijana(int[] niz) {
		int med=0;
		if (niz.length%2!=0) {
			med=niz[(niz.length-1)/2];
			System.out.println("Medijana: "+ med);
		}
		else if (niz.length%2==0) {
			med=(((niz[niz.length/2])+ ((niz.length/2)+1)))/2;
			System.out.println("Medijana: "+ med);
		}
	}
	
}
