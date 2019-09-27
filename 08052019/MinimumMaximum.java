package devetidomaci;

import java.util.Scanner;

public class MinimumMaximum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Uneti n: ");
		int n = sc.nextInt();
		int[] a = new int[n];

		ucitajNiz(a);
		minimum(a);
	    maximum(a);

	}

	public static void ucitajNiz(int[] niz) {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < niz.length; i++) {
			System.out.println("Uneti element niza: ");
			niz[i] = sc.nextInt();
		}
	}

	public static void minimum(int[] niz) {
		Scanner sc = new Scanner(System.in);
		int min = 0;
		for (int i = 0; i < niz.length; i++) {
			min = niz[0];
			if (niz[i] <=min) {
				min = niz[i];
			}else continue;
		}
		System.out.println("Minimalni broj u nizu je: "+ min);
	}

	public static void maximum(int[] niz) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] > max) {
				max = niz[i];
			}else continue;
		}
		System.out.println("Maksimalni broj u nizu je: "+ max);
	}	

}
