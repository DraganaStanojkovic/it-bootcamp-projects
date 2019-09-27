package drugidomaci;

import java.util.Scanner;

public class ObimIPovrsine {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		String s;
		System.out.println("Ime figure: ");
		s=sc.nextLine();
		double a,b,r,p,o;
		
		switch (s) {
		case "kvadrat": {
			System.out.println("Uneti stranicu a: ");
			a=sc.nextDouble();
			p=a*a;
			o=4*a;
			System.out.printf("Povrsina figure je %.2f, a obim je %.2f.\n",p,o);break;
		}
		case "pravougaonik": {
			System.out.println("Uneti stranicu a: ");
			a=sc.nextDouble();
			System.out.println("Uneti stranicu b:");
			b=sc.nextDouble();
			p=a*b;
			o=2*a+2*b;
			System.out.printf("Povrsina figure je %.2f, a obim je %.2f.\n",p,o);break;
		}
		case "krug": {
			System.out.println("Uneti poluprecnik: ");
			r=sc.nextDouble();
			p=r*r*Math.PI;
			o=2*r*Math.PI;
			System.out.printf("Povrsina figure je %.2f, a obim je %.2f.\n",p,o);break;
			
		}
		default:System.out.println("Neispravan unos figure!");
		}

	}

}
