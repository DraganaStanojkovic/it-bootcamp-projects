package drugidomaci;

import java.util.Scanner;

public class ArmstrongovBroj {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x,a,b,c,d;
		System.out.println("Unos broja za proveru: ");
		x=sc.nextInt();
		
		a=(x/100)*(x/100)*(x/100);
		b=((x%100)/10)*((x%100)/10)*((x%100)/10);
		c=((x%100)%10)*((x%100)%10)*((x%100)%10);
		d=a+b+c;
		
		if (x==d) {
			System.out.println("Broj "+x+ " jeste Armstrongov broj.");
		}
		else if (x!=d) {
			System.out.println("Broj "+x+ " nije Armstrongov.");
		}

	}

}
