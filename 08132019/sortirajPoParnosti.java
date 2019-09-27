package cetrnaestidomaci;

import java.util.Arrays;
import java.util.Scanner;

public class sortirajPoParnosti {

	public static void main(String[] args) {
		int[] a = new int [7];
		unesiNiz(a);
		int [] sortiran = sortirajPoParnostiBrojeve(a);
		System.out.println("Niz sortran po parnosti je: " + Arrays.toString(sortiran));

	}

	public static void unesiNiz(int[] a) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite elemente niza: ");
		for (int i = 0; i < a.length; i++) {
		a[i] = sc.nextInt();
		}
	}

	public static int[] sortirajPoParnostiBrojeve( int[] a) {
		int [] sort = new int[a.length];
		int k = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				sort[k] = a[i];
				k++;
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				sort[k] = a[i];
				k++;
			}
		}
		
		return sort;
	}
}
