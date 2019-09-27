package polica;

public class Knjiga {
	private String naziv;
	private List[] nizListova;
	private int brListova;

	public Knjiga(String naziv) {
		super();
		this.naziv = naziv;
		nizListova = new List[200];
		brListova = 0;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setList(List l) {
		if (l.getRedniBrojLista() >= 0 && l.getRedniBrojLista() < nizListova.length) {
			for (int i = 0; i < nizListova.length; i++) {
				if (l.getRedniBrojLista() == i + 1) {
					nizListova[brListova] = l;
					brListova++;
					return;
				}

			}

		}
	}

	public int getBrListova() {
		return brListova;
	}

	public List getList(int redBr) {
		redBr--;
		if (redBr >= 0 && redBr < brListova) {
			return nizListova[redBr];
		} else
			return null;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < brListova; i++) {
			sb.append(nizListova[i].getTekst() + "(" + nizListova[i].getRedniBrojLista() + ")" + "\n");
		}
		return sb.toString();

	}

}
