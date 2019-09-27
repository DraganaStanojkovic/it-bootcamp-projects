package izraz;

public class Sabiranje extends BinarnaOperacija {

	public Sabiranje(Izraz levi, Izraz desni) {
		super(levi, desni);
	}

	@Override
	public double izracunaj() {
		return levi.izracunaj() + desni.izracunaj();
	}

	public String toString() {
		return "Rezultat operacije: " + levi.izracunaj() + " i " + desni.izracunaj() + " je " + izracunaj();
	}
}
