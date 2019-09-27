package cetrnaestidomaci;

import java.util.Scanner;

public class aPodskupB {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Unesite broj elemanata niza A: ");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Unesite broj elemenata niza B: ");
		int m = sc.nextInt();
		int[] b = new int[m];

		elementiA(a);
		elementiB(b);
		
		boolean rez=podskup (a,b);
		
		if (rez==true) {
			System.out.println("Niz A je podskup niza B.");
		}else 
			System.out.println("Niz A nije podskup niza B.");

		/*if (aPodskupaB(a, b) == true) {
			System.out.println("Niz a jeste podskup niza b.");
		} else if (aPodskupaB(a, b) == false) {
			System.out.println("Niz a nije podskup niza b.");
		}*/

	}

	public static void elementiA(int[] a) {
		System.out.println("Unesite elemente niza a: ");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
	}

	public static void elementiB(int[] b) {
		System.out.println("Unesite elemente niza b: ");
		for (int i = 0; i < b.length; i++) {
			b[i] = sc.nextInt();
		}
	}

	static boolean podskup(int []a, int[] b) {
		for (int i=0; i<a.length; i++) {
			if (!daLiJeUNizu(a[i],b)) {
				return false;
			}
		}
		return true;
	}
	
	static boolean daLiJeUNizu (int broj, int []niz) {
		for (int i=0; i<niz.length; i++) {
			if (niz[i]==broj) {
				return true;
			}
		}
		return false;
	}

	/*public static boolean aPodskupaB(int[] a, int[] b) {
		boolean postoji = true;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					postoji = true;
				} else
					postoji = false;
			}
		}
		return postoji;
	}*/
}