package osmidomaci;

import java.util.Scanner;

public class ZacaraniKruzic {
	public static Scanner sc = new Scanner(System.in);

	public static double korektivniFaktor(int p) {
		double korf = 0;
		if (p == 1) {
			korf = 0.55;
		} else if (p == 0) {
			korf = 0.68;
		}
		return korf;
	}

	public static double idPica(int id) {
		double p = 0;
		
		switch (id) {
		case 1:
			if (id == 1) {
				p = 50;
			}
			;
			break;
		case 2:
			if (id == 2) {
				p = 40;
			}
			;
			break;
		case 3:
			if (id == 3) {
				p = 4.7;
			}
			;
			break;
		case 4:
			if (id == 4) {
				p = 11;
			}
			;
			break;
		default:
			System.out.println("Greška, zeljeni id nije u bazi podataka. Pokusajte ponovo.");
		}
			return p;
			
	}

	public static double bloodAlcoholCount(double suma, double kf, double t) {
		double x = (suma / (kf * 1000 * t));
		return x;
	}

	public static void tabela(double BAC) {
		if (BAC >= 0 && BAC <= 0.2) {
			System.out.printf("BAC: %.2f - Dozvoljena alkoholisanost\n", BAC);
			System.out.println("Kazna: Bez kazne\n" + "Kazneni poeni: 0\n" + "Zabrana voznje: 0");
		} else if (BAC >= 0.21 && BAC <= 0.5) {
			System.out.printf("BAC: %.2f - Umerena alkoholisanost\n", BAC);
			System.out.println("Kazna: 10.000 din\n" + "Kazneni poeni: 0\n" + "Zabrana voznje: 0");
		} else if (BAC >= 0.51 && BAC <= 0.8) {
			System.out.printf("BAC: %.2f - Srednja alkoholisanost\n", BAC);
			System.out.println("Kazna: 10.000-20.000 din\n" + "Kazneni poeni: 6\n" + "Zabrana voznje: 3 meseca");
		} else if (BAC >= 0.81 && BAC <= 1.2) {
			System.out.printf("BAC: %.2f - Visoka alkoholisanost\n", BAC);
			System.out.println("Kazna: 20.000-40.000 din\n" + "Kazneni poeni: 8\n" + "Zabrana voznje: 4 meseca");
		} else if (BAC >= 1.21 && BAC <= 1.6) {
			System.out.printf("BAC: %.2f - Teska alkoholisanost\n", BAC);
			System.out.println("Kazna: 100.000-120.000 din\n" + "Kazneni poeni: 9\n" + "Zabrana voznje: 8 meseci");
		} else if (BAC >= 1.61 && BAC <= 2.0) {
			System.out.printf("BAC: %.2f - Visoka alkoholisanost\n", BAC);
			System.out.println("Kazna: 100.000-120.000 din\n" + "Kazneni poeni: 14\n" + "Zabrana voznje: 8 meseci");
		} else if (BAC >= 2.01) {
			System.out.printf("BAC: %.2f - Potpuna alkoholisanost\n", BAC);
			System.out.println("Kazna: 30-60 dana zatvora\n" + "Kazneni poeni: 15\n" + "Zabrana voznje: 9 meseci");
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Dobrodosli u alko aproksimator 9000!");
		System.out.println("-------------------------------------");
		System.out.println("Unesite svoju tezinu u kg: ");
		double t = sc.nextDouble();
		System.out.println("Unesite svoj pol (ako ste musko unesite 1, ako ste zensko unesite 0): ");
		int p = sc.nextInt();
		double kf = korektivniFaktor(p);
		double suma = 0;

		for (int i = 1; i <= 4; i++) {
			
			System.out.println("Unesite id pica koje ste pili ili -1 ako ste vec uneli sva pica: ");
			int id = sc.nextInt();
			if (id == -1)
				break;
			else if (id>4){
				System.out.println("Greška, željeni id nije u bazi podataka. Pokušajte ponovo: ");
				continue;}
			double d = idPica(id);
			System.out.println("Unesite koliko mililitara tog pica ste popili: ");
			double mil = sc.nextInt();
			suma += mil * d;

		}
		double BAC = bloodAlcoholCount(suma, kf, t);
		tabela(BAC);
	}

}
