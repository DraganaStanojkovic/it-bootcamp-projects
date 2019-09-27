package student;

public class Ocena {
	private int bodovi;
	private Predmet pr;

	public Ocena(int bodovi, Predmet pr) {

		this.bodovi = bodovi;
		this.pr = pr;
	}

	public int getBodovi() {
		return bodovi;
	}

	public Predmet getPr() {
		return pr;
	}

	public int getOcena() {
		int ocena;

		if (bodovi < 50)
			ocena = 5;
		else if (bodovi < 60)
			ocena = 6;
		else if (bodovi < 70)
			ocena = 7;
		else if (bodovi < 80)
			ocena = 8;
		else if (bodovi < 90)
			ocena = 9;
		else
			ocena = 10;

		return ocena;
	}

	public String ispis() {
		String s = "";
		s += "Predmet: " + getPr() + "\n" + "Ocena: " + getOcena();
		return s;

	}

}

