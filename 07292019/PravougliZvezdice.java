package petidomaci;

import java.util.Scanner;

public class PravougliZvezdice {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n, i;
		System.out.println("Uneti broj redova: ");
		n=sc.nextInt();
		
		for (i=1; i<=n; i++) {
			int x=i;
			while (x>0) {
				System.out.print("*");
			    x--;
			}
			System.out.print("\n");
		}	
		

	}

}
