package drugidomaci;

import java.util.Scanner;

public class IzracunavanjePrestupneGodine {

	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		  int a;
		  System.out.println("Uneti godinu");
		  a=sc.nextInt();

		  if (a%4==0) {
			  if ((a%100!=0) || (a%400==0)) {
				  System.out.println("1600. jeste prestupna godina");
			  }
			  else {
				  System.out.println("2100. nije prestupna godina");
			  }
		  }
		  
		  
	}

}
