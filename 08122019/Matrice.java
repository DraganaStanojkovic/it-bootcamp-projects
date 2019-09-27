package matrice;

import java.util.Random;
import java.util.Scanner;

public class Matrice {
	public static Scanner sc = new Scanner(System.in);

	// NIJE DOZVOLJENO MENJANJE MAIN FUNKCIJE!!!!!!!!!!!!!!
	// NIJE DOZOVLJENO MENJANJE POTPISA FUNKCIJA(POTPIS FUNKCIJE SE SASTOJI OD
	// POVRATNE VREDNOSTI, IMENA FUNKCIJE I PARAMETARA
	// DOZVOLJENO JE ALI NIJE POZELJNO NITI POTREBNO DEFINISATI I DODAVATI NOVE
	// FUNKCIJE
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite dimenziju kvadratne matrice (n): ");
		int n = sc.nextInt();

		int[][] matrica = new int[n][n];
		generisiElementeMatrice(matrica, 100);
		System.out.println("Matrica izgleda ovako: ");
		ispisiMatricu(matrica);
		System.out.println();

		int[] elementiNaglavnoj = elementiNaGlavnojDijagonali(matrica);
		System.out.println("Elementi na glavnoj dijagonali su: ");
		if (elementiNaglavnoj != null)
			ispisiNiz(elementiNaglavnoj);
		else
			System.out.println("Greska u funkciji elementiNaGlavnojDijagonali");
		System.out.println();

		System.out.println("Elementi na sporednoj dijagonali su: ");
		int[] elementiNaSporednoj = elementiNaSporednojDijagonali(matrica);
		if (elementiNaSporednoj != null)
			ispisiNiz(elementiNaSporednoj);
		else
			System.out.println("Greska u funkciji elementiNaSporednojDijagonali");
		System.out.println();

		System.out.println("Elementi iznad glavne dijagonale su: ");
		ispisiElementeIznadGlavneDijagonale(matrica);
		System.out.println();

		System.out.println("Elementi ispod glavne dijagonale su: ");
		ispisiElementeIspodGlavneDijagonale(matrica);
		System.out.println();

		int[][] transponovanaMatrica = transponujMatricu(matrica);
		System.out.println("Transponovana matrica izgleda ovako: ");
		if (transponovanaMatrica != null)
			ispisiMatricu(transponovanaMatrica);
		else
			System.out.println("Greska u funkciji transponujMatricu.");
		System.out.println();

		System.out.println("Pre uklanjanja duplih elemenata niz izgleda ovako: ");
		ispisiNiz(elementiNaglavnoj);
		System.out.println();

		elementiNaglavnoj = ukloniElementeKojiSePonavljajuUnizu(elementiNaglavnoj);
		System.out.println("Nakon uklanjanja duplih elemenata niz izlgeda ovako: ");
		if (elementiNaglavnoj != null)
			ispisiNiz(elementiNaglavnoj);
		else
			System.out.println("Greska u funkcji ukloniElementeKojiSePonavljajuUnizu");

	}

	public static void generisiElementeMatrice(int[][] matrica, int gornjaGranica) {

		Random r = new Random();
		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica[i].length; j++) {
				matrica[i][j] = r.nextInt(gornjaGranica);
			}
		}

	}

	public static int[] elementiNaGlavnojDijagonali(int[][] matrica) {
		int[] povratniNiz = new int[matrica.length];
		int k = 0;
		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica[i].length; j++) {
				if (i == j)
					povratniNiz[k] = matrica[i][j];

			}
			k++;
		}

		return povratniNiz; // STOJI OVDE SAMO DA SE KOMPAJLER NE BI BUNIO STO
							// FUNKCIJA KOJA VRACA POVRATNU VREDNST NEMA RETRUN
							// U SEBI
		// NAKON STO IMPLEMENTIRATE FUNKCIJU, ZAMENITE OVAJ RETURN NULL NEKIM
		// KOJI VI MISLITE DA TREBA
		// ISTO VAZI I ZA FUNKCIJE ISPOD KOJE IMAJU RETURN NULL
	}

	public static int[] elementiNaSporednojDijagonali(int[][] matrica) {

		int[] sporednaDijagonala = new int[matrica.length];
		int k = 0;
		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica[i].length; j++) {
				if (i + j == matrica.length - 1) {
					sporednaDijagonala[k] = matrica[i][j];
				}
			}
			k++;
		}

		return sporednaDijagonala;
	}

	public static int[][] transponujMatricu(int[][] matrica) {
		int brRedovaOrig = matrica.length;
		int brKolonaOrig = matrica[0].length;
		int[][] transponovanaMatrica = new int[brKolonaOrig][brRedovaOrig];

		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica[i].length; j++) {
				transponovanaMatrica[j][i] = matrica[i][j];
			}
		}

		return transponovanaMatrica;
	}

	public static void ispisiElementeIznadGlavneDijagonale(int[][] matrica) {
		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica[i].length; j++) {
				
				if (i < j) {
					System.out.print(matrica[i][j] + " ");

				} else if (i > j) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void ispisiElementeIspodGlavneDijagonale(int[][] matrica) {
		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica[i].length; j++) {
				if (i > j) {
					System.out.print(matrica[i][j] + " ");
				} else if (i < j)
					System.out.print(" " + " ");
			}
			System.out.println();
		}
	}

	public static void ispisiMatricu(int[][] matrica) {
		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica[i].length; j++) {
				System.out.print(matrica[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void ispisiNiz(int[] niz) {
		for (int i = 0; i < niz.length; i++) {
			System.out.print(niz[i] + " ");
		}
	}

	public static int[] ukloniElementeKojiSePonavljajuUnizu(int[] niz) {
		int end = niz.length;

	    for (int i = 0; i < end; i++) {
	        for (int j = i + 1; j < end; j++) {
	            if (niz[i] == niz[j]) {                  
	                niz[j] = niz[end-1];
	                end--;
	                j--;
	            }
	        }
	    }

		int[] nizBezPonavljanja = new int[end];
		for (int k = 0; k < nizBezPonavljanja.length; k++) {
			nizBezPonavljanja[k] = niz[k];
		}
		return nizBezPonavljanja;

	}


}
