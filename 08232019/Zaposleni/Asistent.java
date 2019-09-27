package Hijerarhija;

import java.time.LocalDate;

public class Asistent extends Nastavnik {

	private String smer;

	public Asistent(String ime, String prezime, LocalDate godinaRodjenja, LocalDate godinaZaposlenja, double plata,
			String omiljeniPredmet, String listaPredmeta, String smer) {
		super(ime, prezime, godinaRodjenja, godinaZaposlenja, plata, omiljeniPredmet, listaPredmeta);
		this.smer = smer;
	}

	public String getSmerDoktorskihStudija() {
		return smer;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Ime: " + getIme() + "\n" + "Prezime: " + getPrezime() + " \n" + "Godina rodjenja: "
				+ getGodinaRodjenja() + " \n" + "Godina zaposlenja: " + getGodinaZaposlenja() + "\n" + "Plata "
				+ getPlata() + "\n" + "Omiljeni predmet: " + getOmiljeniPredmet() + "\n"
				+ "Lista predmeta na kojima drzi nastavu: " + getListaPredmeta() + "\n" + "Smer: " + smer);
		return sb.toString();
	}
}
