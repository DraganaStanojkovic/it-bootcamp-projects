package Hijerarhija;

import java.time.LocalDate;

public class Zaposleni extends Covek {
	private LocalDate godinaZaposlenja;
	private double plata;

	public Zaposleni(String ime, String prezime, LocalDate godinaRodjenja, LocalDate godinaZaposlenja, double plata) {
		super(ime, prezime, godinaRodjenja);
		this.godinaZaposlenja = godinaZaposlenja;
		this.plata = plata;

	}

	public LocalDate getGodinaZaposlenja() {
		return godinaZaposlenja;
	}

	public double getPlata() {
		return plata;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Ime: " + getIme() + "\n" + "Prezime: " + getPrezime() + " \n" + "Godina rodjenja: "
				+ getGodinaRodjenja() + " \n" + "Godina zaposlenja: " + godinaZaposlenja + "\n" + "Plata " + plata);
		return sb.toString();
	}
}
