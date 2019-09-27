package trecidomaci;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, novB = 0;
		System.out.println("Uneti broj: ");
		n = sc.nextInt();
		int x = n;

		while (n > 0) {
			int c = n % 10;
			novB *= 10;
			novB += c;
			n /= 10;
		}
		System.out.println(novB);
		if (x == novB) 
		{
			System.out.println("Uneti broj jeste palindrom.");
		} else
			System.out.println("Uneti broj nije palindrom.");
	}

}
