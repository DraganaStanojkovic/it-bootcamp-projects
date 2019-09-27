package pozoristance;

public abstract class Zaposleni {
	private String ime;
	private Pozoriste pozoriste;

	public Zaposleni(String ime, Pozoriste pozoriste) {
		super();
		this.ime = ime;
		this.pozoriste = pozoriste;
	}

	public abstract String imePosla();

	public String getIme() {
		return ime;
	}

	public Pozoriste getPozoriste() {
		return pozoriste;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(ime + "( " + this.imePosla() +" ,"+ pozoriste.getSkraceniNaziv() + ")");
		return sb.toString();
	}

}
