package izraz;

public class Oduzimanje extends BinarnaOperacija {

	public Oduzimanje(Izraz levi, Izraz desni) {
		super(levi, desni);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double izracunaj() {
		return levi.izracunaj() - desni.izracunaj();
	}

	public String toString() {
		return "Rezultat operacije: " + levi.izracunaj() + " i " + desni.izracunaj() + " je " + izracunaj();
	}

}
