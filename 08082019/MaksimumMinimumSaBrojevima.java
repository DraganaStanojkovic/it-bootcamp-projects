package dvodimenzionalninizovi;

import java.util.Scanner;

public class MaksimumMinimumSaBrojevima {

	static Scanner sc=new Scanner (System.in);
	
	public static void ucitajNiz(int[][] niz) {
		
		for (int i=0; i<2;i++) {
			for (int j=0; j<3; j++) {
				System.out.println("Unesite vrednosti elemenata niza: ");
				niz [i][j]= sc.nextInt();
				
			}
		}
	}
	
	public static void ispisiNiz(int[][] niz) {
		for (int i=0; i<2;i++) {
			for (int j=0; j<3; j++) {
				System.out.println("Uneti element niza je: "+ niz[i][j]);
				
			}
		}
	}
	
	public static int max(int[][] niz) {
		int max=0;
		for (int i=0; i<2;i++) {
			for (int j=0; j<3; j++) {
				niz[0][0]=max;
				if (niz[i][j]>max) {
					max=niz[i][j];
				}
			}
		}
		return max;
	}
	
	public static int min(int[][] niz) {
		int min= niz[0][0];
		for (int i=0; i<2;i++) {
			for (int j=0; j<3; j++) {
				if (niz[i][j]<min) {
					min=niz[i][j];
				}
			}
		}
		return min;
	}

	public static void main(String[] args) {
		
		int [][] a=new int [2][3];
		ucitajNiz(a);
		ispisiNiz(a);
		System.out.println("Maksimalni element niza je: "+ max(a));
		min(a);
		System.out.println("Minimalni element niza je: "+ min(a));
	}

}