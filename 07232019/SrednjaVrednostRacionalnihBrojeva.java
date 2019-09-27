package prvidomaci;

import java.util.Scanner;

public class SrednjaVrednostRacionalnihBrojeva {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, b, c, d;
		System.out.println("Unesite prvi broj");
		a = sc.nextDouble();
		System.out.println("Unesite drugi broj");
		b = sc.nextDouble();
		System.out.println("Unesite treci broj");
		c = sc.nextDouble();
		d = (a + b + c)/3;
		System.out.println("Srednja vrednost unetih brojeva je: "+d);

	}

}
