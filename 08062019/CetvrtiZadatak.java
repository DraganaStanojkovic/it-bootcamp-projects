package desetidomaci;

import java.util.Scanner;

public class CetvrtiZadatak {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi n:");
		int n = sc.nextInt();
		int[] a = new int[n];

		ucitajNiz(a);
		duplikati(a);
	}

	static void ucitajNiz(int[] niz) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < niz.length; i++) {
			System.out.println("Unesi element: ");
			niz[i] = sc.nextInt();
		}
	}
	
	static void duplikati(int[] niz) {
		for (int i=0; i<niz.length-1; i++) {
			for (int j=i+1; j<niz.length; j++) {
				if (niz[i]==niz[j]) System.out.println("Duplikat niza je: "+ niz [i]);
			}
		}
	}
}
