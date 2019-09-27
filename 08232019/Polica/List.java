package polica;

public class List {
	private int redniBroj;
	private String tekst;

	public List(int redniBrojLista, String tekst) {
		super();
		this.redniBroj = redniBrojLista;
		this.tekst = tekst;
	}

	public int getRedniBrojLista() {
		return redniBroj;
	}

	public String getTekst() {
		return tekst;
	}

	public void setTekst(String tekst) {
		this.tekst = tekst;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(tekst + "(" + redniBroj + ").");
		return sb.toString();
	}

}
