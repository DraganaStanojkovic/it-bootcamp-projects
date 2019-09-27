package Hijerarhija;

import java.time.LocalDate;

public class Student extends Covek {

	private int trenutnaGodStudija;
	private double trenutniProsek;

	public Student(String ime, String prezime, LocalDate godinaRodjenja, int trenutnaGodStudija,
			double trenutniProsek) {
		super(ime, prezime, godinaRodjenja);
		this.trenutnaGodStudija = trenutnaGodStudija;
		this.trenutniProsek = trenutniProsek;
	}

	public int getTrenutnaGodStudija() {
		return trenutnaGodStudija;
	}

	public double getTrenutniProsek() {
		return trenutniProsek;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Ime: " + getIme() + "\n" + "Prezime: " + getPrezime() + " \n" + "Godina rodjenja: "
				+ getGodinaRodjenja() + " \n" + "Trenutna godina studija: " + trenutnaGodStudija + "\n"
				+ "Godina studija " + trenutniProsek);
		return sb.toString();
	}
}
