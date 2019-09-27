package izraz;

public class Promenljiva extends Izraz {
	private String ime;
	private double vrednost;

	public Promenljiva(String ime, double vrednost) {
		super();
		this.ime = ime;
		this.vrednost = vrednost;
	}

	@Override
	public double izracunaj() {
		return vrednost;
	}

	public String toString() {
		return "Promenljiva " + ime + " ima vrednost: " + vrednost;
	}

}
