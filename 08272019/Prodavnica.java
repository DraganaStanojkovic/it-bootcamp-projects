package prodavnica;

public class Prodavnica {
	private String ime;
	private String lokacija;
	private Artikal[] inventar;
	private int brArtikala;

	public Prodavnica(String ime, String lokacija) {
		super();
		this.ime = ime;
		this.lokacija = lokacija;
		inventar = new Artikal[10];
		brArtikala = 0;
	}

	public void dodaj(Artikal a) {
		if (brArtikala < inventar.length) {
			inventar[brArtikala] = a;
			brArtikala++;
		} else {
			Artikal[] inventar2 = new Artikal[2 * inventar.length];
			for (int i = 0; i < inventar.length; i++) {
				inventar2[i] = inventar[i];
			}
			inventar = inventar2;
			inventar[brArtikala] = a;
			brArtikala++;
		}
	}

	public Artikal[] pretrazi(String tekst) {
		Artikal[] noviNiz = new Artikal[prebrojArtikle(tekst)];
		int brojacNiza = 0;
		for (int i = 0; i < inventar.length; i++) {
			if (inventar[i] != null && inventar[i].ime().toLowerCase().contains(tekst.toLowerCase())) {
				noviNiz[brojacNiza] = inventar[i];
				brojacNiza++;
			}
		}

		return noviNiz;
	}

	public int prebrojArtikle(String tekst) {
		int brArtikla = 0;
		for (int i = 0; i < inventar.length; i++) {
			if (inventar[i] != null && inventar[i].ime().toLowerCase().contains(tekst.toLowerCase())) {
				brArtikla++;
			}
		}

		return brArtikla;
	}

	public String getIme() {
		return ime;
	}

	public String getLokacija() {
		return lokacija;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append(ime + ": " + lokacija + " [" + "\n");
		for (int i = 0; i < inventar.length; i++) {
			if (inventar[i] != null) {
				sb.append("\t" + inventar[i]);
			}
		}
		sb.append("]");
		return sb.toString();
	}

}