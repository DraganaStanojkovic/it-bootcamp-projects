package drugidomaci;

import java.util.Scanner;

public class DaniUNedelji {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		   int a;
		   System.out.println("Uneti broj dana u nedelji");
		   a=sc.nextInt();
		   
		   
		   switch (a) {
		   
		   case 1: System.out.println("Ponedeljak, do vikenda je ostalo 5 dana :(");break;
		   case 2: System.out.println("Utorak, do vikenda je ostalo 4 dana :(");break;
		   case 3: System.out.println("Sreda, do vikenda je ostalo 3 dana :(");break;
		   case 4: System.out.println("Cetvrtak, do vikenda je ostalo 2 dana :(");break;
		   case 5: System.out.println("Petak, do vikenda je ostao 1 dan :D");break;
		   case 6: System.out.println("Subota");break;
		   default: System.out.println("Error");
		   }
		   

	}

}
