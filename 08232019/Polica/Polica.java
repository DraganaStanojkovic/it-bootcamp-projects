package polica;

public class Polica {

	private Knjiga[] nizKnjiga;
	private int brKnjiga;

	public Polica() {
		super();
		nizKnjiga = new Knjiga[10];
		brKnjiga = 0;
	}

	public void setKnjiga(Knjiga k) {
		if (brKnjiga == nizKnjiga.length && brKnjiga != nizKnjiga.length) {
			return;
		}
		if (brKnjiga < nizKnjiga.length) {
			nizKnjiga[brKnjiga] = k;
			brKnjiga++;
		}
	}

	public Knjiga getKnjiga(String naziv) {
		for (int i = 0; i < nizKnjiga.length; i++) {
			if (nizKnjiga[i].getNaziv().equals(naziv) == true) {
				return nizKnjiga[i];
			}

		}
		return null;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < brKnjiga; i++) {
			sb.append(nizKnjiga[i].getNaziv() + "\n" + nizKnjiga[i].toString() + "\n");

		}
		return sb.toString();
	}

}
