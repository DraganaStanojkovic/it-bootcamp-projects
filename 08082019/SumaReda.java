package dvodimenzionalninizovi;

import java.util.Scanner;

public class SumaReda {
	
	public static Scanner sc=new Scanner (System.in);
	
public static void ucitajNiz(int[][] niz) {
		
		for (int i=0; i<3;i++) {
			for (int j=0; j<niz.length; j++) {
				System.out.println("Unesite vrednosti elemenata niza: ");
				niz [i][j]= sc.nextInt();
				
			}
		}
	}
	
	public static void ispisiNiz(int[][] niz) {
		for (int i=0; i<3;i++) {
			for (int j=0; j<niz.length; j++) {
				System.out.println("Uneti element niza je: "+ niz[i][j]);
				
			}
		}
	}
	
	public static int sumaNReda (int[][] niz,int n) {
		int suma=0;
			for (int j=0; j<niz[n].length; j++) {
				suma+=niz[n][j];
				
			}
		return suma;
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int [][] a=new int [3][3];
		
	
		ucitajNiz(a);
		ispisiNiz(a);
		System.out.println("Unesite broj reda n: ");
		int n=sc.nextInt();
		System.out.println("Suma n tog reda je: "+ sumaNReda (a, n));
		
	}

}
