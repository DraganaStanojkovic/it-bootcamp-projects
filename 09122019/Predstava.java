package pozoristance;

import java.util.ArrayList;

public class Predstava {
	private String naziv;
	private Pozoriste pozoriste;
	private ArrayList<Zaposleni> zaposleni;
	private int brKostimografa;

	public Predstava(String naziv, Pozoriste pozoriste, Reditelj reditelj) {
		this.naziv = naziv;
		this.pozoriste = pozoriste;
		zaposleni = new ArrayList<Zaposleni>();
		this.zaposleni.add(reditelj);
		this.brKostimografa = 0;
	}

	public boolean dodaj(Glumac glumac) {
		zaposleni.add(glumac);
		return true;
	}

	public boolean dodaj(Kostimograf kostimograf) {
		if (!kostimograf.getPozoriste().getNaziv().equals(pozoriste.getNaziv()) || brKostimografa == 2) {
			return false;
		}
		this.zaposleni.add(kostimograf);
		this.brKostimografa++;
		return true;
	}

	public String getNaziv() {
		return naziv;
	}

	public Pozoriste getPozoriste() {
		return pozoriste;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(naziv + ":" + "\n");
		for (Zaposleni z : zaposleni) {
			sb.append(z + "\n\t");
		}

		return sb.toString();
	}

}
