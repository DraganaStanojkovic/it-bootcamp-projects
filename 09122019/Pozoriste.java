package pozoristance;

public class Pozoriste {
	private static int globalID = 0;
	private int id;
	private String naziv;

	public Pozoriste(String naziv) {
		super();
		this.naziv = naziv;
		id = globalID;
		globalID++;
	}

	public int getId() {
		return id;
	}

	public String getNaziv() {
		return naziv;
	}

	public String getSkraceniNaziv() {
		String s = "";
		String[] reci = naziv.split(" ");
		for (String rec : reci) {
			char prvoSlovo = Character.toUpperCase(rec.charAt(0));
			s += String.valueOf(prvoSlovo);
		}
		return s;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(naziv + "[" + id + "]");

		return sb.toString();
	}
}
