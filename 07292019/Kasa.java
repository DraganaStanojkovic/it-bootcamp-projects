package petidomaci;

import java.util.Scanner;

public class Kasa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double cena, kol, suma = 0, novac, kusur;
		float sumaRound;
		int i, n = 100;

		System.out.println("Uneti cenu 1. proizvoda");
		cena = sc.nextDouble();
		System.out.println("Uneti kolicinu 1. proizvoda");
		kol = sc.nextDouble();
		suma += cena * kol; // samo za prvi unos

		for (i = 2; i < n; i++) {
			System.out.println("Unesite cenu " + i + ". proizvoda ili (-1) ako nema vise proizvoda");
			cena = sc.nextDouble();
			if (cena == -1)
				break;
			else {
				System.out.println("Uneti kolicinu " + i + ". proizvoda");
				kol = sc.nextDouble();
			}
			suma += cena * kol; // svi unosi zajedno
		}
		sumaRound = Math.round(suma);
		
		System.out.println("Ukupna cena proizvoda je: " + sumaRound);
		System.out.println("Koliko vam je novca dao kupac?");
		novac = sc.nextDouble();
		kusur = novac - suma;
		while (kusur < 0) {
			System.out.println("Dali ste manje novca, unestite ponovo. ");
			novac = sc.nextDouble();
			kusur = novac - sumaRound;
		}
		
		kusur = Math.round(kusur);
		System.out.println("Kusur je: " + kusur);
		

		int b20, b10, b5, b2, b1;
		b20 = 0;
		b10 = 0;
		b5 = 0;
		b2 = 0;
		b1 = 0;

		while (kusur > 0) {

			if (kusur >= 20) {
				kusur -= 20;
				b20++;
			} else if (kusur >= 10) {
				kusur -= 10;
				b10++;
			} else if (kusur >= 5) {
				kusur -= 5;
				b5++;
			} else if (kusur >= 2) {
				kusur -= 2;
				b2++;
			} else if (kusur >= 1) {
				kusur -= 1;
				b1++;
			}

		}
		System.out.println("Da biste vratili najmanji broj kovanica potrebno je: ");
		System.out.println(b20 + " od 20. dinara");
		System.out.println(b10 + " od 10. dinara");
		System.out.println(b5 + " od 5. dinara");
		System.out.println(b2 + " od 2. dinara");
		System.out.println(b1 + " od 1. dinara");

	}

}
