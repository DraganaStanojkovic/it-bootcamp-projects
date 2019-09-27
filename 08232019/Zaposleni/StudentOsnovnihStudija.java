package Hijerarhija;

import java.time.LocalDate;

public class StudentOsnovnihStudija extends Student {

	private String smerStudija;

	public StudentOsnovnihStudija(String ime, String prezime, LocalDate godinaRodjenja, int trenutnaGodStudija,
			double trenutniProsek, String smerStudija) {
		super(ime, prezime, godinaRodjenja, trenutnaGodStudija, trenutniProsek);
		this.smerStudija = smerStudija;
	}

	public String getSmerStudija() {
		return smerStudija;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Ime: " + getIme() + "\n" + "Prezime: " + getPrezime() + " \n" + "Godina rodjenja: "
				+ getGodinaRodjenja() + " \n" + "Trenutna godina studija: " + getTrenutnaGodStudija() + "\n"
				+ "Trenutni Prosek: " + getTrenutniProsek() + "\n" + "Smer studija: " + smerStudija);
		return sb.toString();
	}
}
