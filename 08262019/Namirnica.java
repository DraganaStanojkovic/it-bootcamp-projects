package Energija;

public abstract class Namirnica extends Energent {
	private String ime;
	private static int jedinstveniID = 1;
	private int id;

	public Namirnica(String ime) {
		super();
		this.ime = ime;
		id = jedinstveniID;
		jedinstveniID++;
	}

	public String getIme() {
		return ime;
	}

	public int getId() {
		return id;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[" + id + "]" + "Ime_ " + ime);
		return sb.toString();
	}
}
