package Hijerarhija;

import java.time.LocalDate;

public class Sluzbenik extends Zaposleni {

	private String odsek;

	public Sluzbenik(String ime, String prezime, LocalDate godinaRodjenja, LocalDate godinaZaposlenja, double plata,
			String odsek) {
		super(ime, prezime, godinaRodjenja, godinaZaposlenja, plata);
		this.odsek = odsek;
	}

	public String getOdsek() {
		return odsek;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Ime: " + getIme() + "\n" + "Prezime: " + getPrezime() + " \n" + "Godina rodjenja: "
				+ getGodinaRodjenja() + " \n" + "Godina zaposlenja: " + getGodinaZaposlenja() + "\n" + "Plata "
				+ getPlata() + "\n" + "Odsek:" + odsek);
		return sb.toString();
	}
}
