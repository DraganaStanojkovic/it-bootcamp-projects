package dvodimenzionalninizovi;

import java.util.Scanner;

public class samoglasnici {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite String: ");
		String s = sc.nextLine();

		String[] nizSamoglasnika = new String[s.length()];

		int broj = 0;

		for (int i = 0; i < s.length(); i++) {
			if (daLiJeSamoglasnik(s.charAt(i)) == true) {
				int start = i;
				int kraj = krajSamoglasnika(start, s);
				nizSamoglasnika[broj] = s.substring(start, kraj);
				broj++;
				i = kraj + 1;
			}
		}
		
		String maxNizSamoglasnika = najduziiNiz(nizSamoglasnika);
		System.out.println("Najduzi podstring samoglasnika je: " + maxNizSamoglasnika);

	}

	static boolean daLiJeSamoglasnik(char znak) {
		if (znak == 'a' || znak == 'e' || znak == 'i' || znak == 'o' || znak == 'u') {
			return true;
		}
		return false;
	}

	static int krajSamoglasnika(int start, String s) {
		int kraj = start;
		while (kraj < s.length() && daLiJeSamoglasnik(s.charAt(kraj))) {
			kraj++;
		}
		return kraj;
	}

	static String najduziiNiz(String[] niz) {
		String max = "";
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] != null && niz[i].length() > max.length()) {
				max = niz[i];
			}

		}
		return max;
	}

}
