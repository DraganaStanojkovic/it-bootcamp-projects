package prodavnica;

public abstract class Artikal {

	private int jedinstveniID = 1;
	private int id;
	private double cena;
	private int kolicina;

	public Artikal(double cena, int kolicina) {
		super();
		this.cena = cena;
		this.kolicina = kolicina;
		id = jedinstveniID;
		jedinstveniID++;
	}

	public boolean kupi() {
		if (kolicina > 0) {
			kolicina--;
			return true;
		} else
			return false;
	}

	public abstract String ime();

	public int getId() {
		return id;
	}

	public double getCena() {
		return cena;
	}

	public int getKolicina() {
		return kolicina;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("#" + id + ": " + ime() + " - " + cena + " [kol: " + kolicina + "]" + "\n");

		return sb.toString();
	}

}
