package izraz;

public class Broj extends Izraz {

	private double vrednost;

	public Broj(double vrednost) {
		this.vrednost = vrednost;
	}

	@Override
	public double izracunaj() {

		return vrednost;
	}

	public double getVrednost() {
		return vrednost;
	}

	public void setVrednost(double vrednost) {
		this.vrednost = vrednost;
	}

	public String toString() {
		return "Vrednost broja je: " + vrednost;
	}

}
