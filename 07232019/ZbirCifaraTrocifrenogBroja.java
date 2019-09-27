package prvidomaci;

import java.util.Scanner;

public class ZbirCifaraTrocifrenogBroja {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x,a,b,c,d;
		System.out.println("Uneti trocifreni broj: ");
		x=sc.nextInt();
		
		a=x/100;
		b=(x%100)/10;
		c=(x%100)%10;
		d=a+b+c;
		System.out.println("Zbir cifara trocifrenog broja je: "+d);

	}

}
