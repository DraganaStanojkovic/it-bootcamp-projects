package dvodimenzionalninizovi;

import java.util.Scanner;

public class BrojKaraktera {
	public static Scanner sc = new Scanner(System.in);

	static int brojKaraktera(String s, char c) {

		int x = 0;
		int i;
		for (i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'i') {
				x++;
			}
		}
		System.out.println("Karakter postoji u reci " + x + " puta.");
		return x;
	}

	public static void main(String[] args) {

		System.out.println("Unesi rec: ");

		String s = sc.next();
		System.out.println("Karakter koji se proverava je malo slovo i");
		char c = 'i';
		brojKaraktera(s, c);

	}
}