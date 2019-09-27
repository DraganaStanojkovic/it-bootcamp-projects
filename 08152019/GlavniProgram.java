package klasaPravougaonik;

public class GlavniProgram {

	public static void main(String[] args) {
		Pravougaonik p1=new Pravougaonik(5.0, 7.0, "Pravougaonik 1");
		Pravougaonik p2=new Pravougaonik(4.0, "Pravougaonik 2");
		
		System.out.println("Stranica a je: " + p1.getA());
		System.out.println("Stranica b je: " + p1.getB());
		System.out.println("Stranica a je: " + p2.getA());
		System.out.println("Stranica b je: " + p2.getB());
        System.out.println(p1.ispisiPravougaonik());
        System.out.println();
        System.out.println(p2.ispisiPravougaonik());
       
	}

}
