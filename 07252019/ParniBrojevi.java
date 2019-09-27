package trecidomaci;

import java.util.Scanner;

public class ParniBrojevi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, n, m;
		System.out.println("Unesite m: ");
		n = sc.nextInt();
		System.out.println("Unesite n: ");
		m =sc.nextInt();
		
		if (n>m) {
			int p=m;
			m=n;
			n=p;
		}
		
		System.out.println("Parni brojevi izmedju n i m su: ");
		for (i = n; i < m; i += 1) {
			if (i % 2 == 0)
				System.out.println(i);
		}
		
	}

}
