package osoba;

public class OsobaD extends Osoba {
	private Datum datumRodjenja;

	public OsobaD(String ime, String prezime, String adresaStanovanja, Datum datumRodjenja) {
		super(ime, prezime, adresaStanovanja);
		this.datumRodjenja = datumRodjenja;
	}

	public OsobaD(OsobaD d) {
		super(d);
		datumRodjenja = d.datumRodjenja;
	}

	@Override
	public int numeroloskiBroj() {
		int sumaCifara = 0;
		int sum = 0;
		int[] nizBrojeva = new int[8];
		String ts = datumRodjenja.toString();
		String[] niz = ts.split(".");
		for (int i = 0; i < niz.length; i++) {
			String broj = niz[i];
			nizBrojeva[i] = Integer.parseInt(broj);
			sumaCifara += nizBrojeva[i];

			if (sumaCifara >= 10 && sumaCifara <= 99) {
				int c = sumaCifara % 10;
				sum += c;
				sumaCifara /= 10;

			}
			return sum;
		}
		return sumaCifara;
	}

	@Override
	public String metabolizam(Datum d) {
		return null;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("Datum rodjenja: " + datumRodjenja);
		return sb.toString();
	}
}
