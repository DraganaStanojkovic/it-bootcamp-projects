package pozoristance;

import java.util.ArrayList;

public class Repertoar {
	private Pozoriste pozoriste;
	private ArrayList<Predstava> predstave;

	public Repertoar(Pozoriste pozoriste) {
		super();
		this.pozoriste = pozoriste;
		predstave = new ArrayList<Predstava>();
	}

	public void dodaj(Predstava p) {
		predstave.add(p);
	}

	public void ukloni(String imePredstave) {
		predstave.remove(imePredstave);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(pozoriste.getNaziv() + " :"+" [ "+ "\n");
		for (int i = 0; i < predstave.size(); i++) {
			sb.append( predstave.get(i)).append("\n");
		}
		sb.append("]");
		return sb.toString();
	}
}
