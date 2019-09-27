package Hijerarhija;

import java.time.LocalDate;

public class Profesor extends Nastavnik {

	private String titula;

	public Profesor(String ime, String prezime, LocalDate godinaRodjenja, LocalDate godinaZaposlenja, double plata,
			String omiljeniPredmet, String listaPredmeta, String titula) {
		super(ime, prezime, godinaRodjenja, godinaZaposlenja, plata, omiljeniPredmet, listaPredmeta);
		this.titula = titula;
	}

	public String getTitula() {
		return titula;
	}

	public void setTitula(String titula) {
		this.titula = titula;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Ime: " + getIme() + "\n" + "Prezime: " + getPrezime() + " \n" + "Godina rodjenja: "
				+ getGodinaRodjenja() + " \n" + "Godina zaposlenja: " + getGodinaZaposlenja() + "\n" + "Plata "
				+ getPlata() + "\n" + "Omiljeni predmet: " + getOmiljeniPredmet() + "\n"
				+ "Lista predmeta na kojima drzi nastavu: " + getListaPredmeta() + "\n" + "Titula: " + titula);
		return sb.toString();
	}
}
