package sedmidomaci;

import java.util.Scanner;

public class PicerijaBrasko {

	public static Scanner sc = new Scanner(System.in);

	public static void Dan() {

		String dan = sc.nextLine();

		do {
			switch (dan) {
			case "Pon":
				System.out.println("Ponedeljak");
				break;
			case "Uto":
				System.out.println("Utorak");
				break;
			case "Sre":
				System.out.println("Sreda");
				break;
			case "Cet":
				System.out.println("Cetvrtak");
				break;
			case "Pet":
				System.out.println("Petak");
				break;
			case "Sub":
				System.out.println("Subota");
				break;
			case "Ned":
				System.out.println("Nedelja");
				break;
			default:
				System.out.println("Greška u unosu. Pokušajte ponovo: ");
				continue;
			}
		} while (dan != "Pon" && dan != "Uto" && dan != "Sre" && dan != "Cet" && dan != "Pet" && dan != "Sub"
				&& dan != "Ned");

	}

	public static int cenaPice(int idPizze) {

		int cena = 0;
		if (idPizze == 2) {
			cena = 320;
		} else if (idPizze == 3) {
			cena = 290;
		} else if (idPizze == 5) {
			cena = 310;
		} else {
			System.out.println("Pogresan unos!");
		}
		return cena;
	}

	public static void main(String[] args) {

		System.out.println("Dobrodosli u Brasko++ pametnu kasu! ");
		// System.out.println("Koji je danas dan (Pon/Uto/Sre/Cet/Pet/Sub/Ned):
		// ? ");

		// Dan();

		// musterije
		int sumaPizza = 0;
		for (int i = 1; i <= 100; i++) {
			System.out.println("Prekinite unos unosenjem -1, nastavite unosenjem bilo kog broja: ");
			int prekid = sc.nextInt();
			if (prekid == -1)
				break;
			System.out.println("Musterija id#" + i + ":");

			System.out.println("Unesite broj pizza: ");

			int brojpica = sc.nextInt();
			
			sumaPizza += brojpica;
			double ukupnaCena=0;
			for (int j = 1; j <= brojpica; j++) {
				System.out.println("Unesite id pizze");
				int idPizze = sc.nextInt();
				
				if (idPizze != 2 && idPizze != 3 && idPizze != 5) {
					System.out.println("Los unos! ");
					break;
				}
				double cena = cenaPice(idPizze);
				/*if (j % 4 == 0) {
					System.out.println("Akcija 3+1 gratis!");
					continue;
				}*/
				if (sumaPizza % 7 == 0) {
					System.out.println("Svaka 7.pizza u toku dana je gratis! ");
					continue;

				}
				ukupnaCena += cena;
			}
			System.out.println("Ukupni racun za placanje je : " + ukupnaCena + " din");
		}

	}

}
