package osoba;

public class OsobaJMBG extends Osoba {
	private String JMBG;

	public OsobaJMBG(String ime, String prezime, String adresaStanovanja, String JMBG) {
		super(ime, prezime, adresaStanovanja);
		this.JMBG = JMBG;
	}

	public OsobaJMBG(OsobaJMBG jmbg) {
		super(jmbg);
		JMBG = jmbg.JMBG;
	}

	@Override
	public int numeroloskiBroj() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String metabolizam(Datum d) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getJMBG() {
		return JMBG;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("JMBG: " + JMBG);
		return sb.toString();
	}

}
