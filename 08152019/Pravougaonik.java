package klasaPravougaonik;

public class Pravougaonik {

	private double a;
	private double b;
	private String ime;

	public Pravougaonik(double A, double B, String ime) {

		a = A;
		b = B;
		this.ime = ime;
	}

	public Pravougaonik(double A, String ime) {

		a = A;
		b= A;
		this.ime = ime;
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public String getIme() {
		return ime;
	}
	
	public double getPovrsina () {
		return a*b;
		
	}
	public double getObim () {
		return 2*(a+b);
	}
	
	public String ispisiPravougaonik () {
		String ispisi="";
		ispisi+="Pravougaonik: " + ime +  "\nDuzina prve stranice je: " + a;
		ispisi+="\nDuzina druge stranice je: " + b + "\nPovrsina pravougaonika je: " + a*b;
		ispisi+="\nObim pravougaonika je: " + 2* (a+b);
		
		return ispisi;
		
	}
}
