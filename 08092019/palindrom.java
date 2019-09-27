package dvodimenzionalninizovi;

import java.util.Scanner;

public class palindrom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite string: ");
		String s = sc.nextLine();

		s = s.toLowerCase();
		s = s.replaceAll("\\s", "");
		
		if (stringPalindrom(s) == false) {
			System.out.println("String nije palindrom.");
		} else {
			System.out.println("String jeste palindrom.");
		}

	}

	static boolean stringPalindrom(String s) {
		int i = 0;
		int j = s.length() - 1;

		while (i <= j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;

			}
			i++;
			j--;
		}
		return true;
	}

}
