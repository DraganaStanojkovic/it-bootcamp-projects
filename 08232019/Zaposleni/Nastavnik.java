package Hijerarhija;

import java.time.LocalDate;

public class Nastavnik extends Zaposleni {

	private String omiljeniPredmet;
	private String listaPredmeta;

	public Nastavnik(String ime, String prezime, LocalDate godinaRodjenja, LocalDate godinaZaposlenja, double plata,
			String omiljeniPredmet, String listaPredmeta) {
		super(ime, prezime, godinaRodjenja, godinaZaposlenja, plata);
		this.omiljeniPredmet = omiljeniPredmet;
		this.listaPredmeta = listaPredmeta;

	}

	public String getOmiljeniPredmet() {
		return omiljeniPredmet;
	}

	public String getListaPredmeta() {
		return listaPredmeta;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Ime: " + getIme() + "\n" + "Prezime: " + getPrezime() + " \n" + "Godina rodjenja: "
				+ getGodinaRodjenja() + " \n" + "Godina zaposlenja: " + getGodinaZaposlenja() + "\n" + "Plata "
				+ getPlata() + "\n" + "Omiljeni predmet: " + omiljeniPredmet + "\n"
				+ "Lista predmeta na kojima drzi nastavu: " + listaPredmeta);
		return sb.toString();
	}
}