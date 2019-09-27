package Energija;

public class Meni {
	private Namirnica[] nizNamirnica;
	private int brNam;

	public Meni(int kapacitet) {
		nizNamirnica = new Namirnica[kapacitet];
		this.brNam = 0;
	}

	public boolean dodaj(Namirnica n) {
		if (brNam == nizNamirnica.length) {
			return false;
		}
		nizNamirnica[brNam] = n;
		brNam++;
		return true;
	}

	public double energVr() {
		double suma = 0;
		for (int i = 0; i < nizNamirnica.length; i++) {
			if (nizNamirnica[i] != null) {
				suma += nizNamirnica[i].energVr();
			}
		}
		return suma;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Meni (" + energVr() + "kJ): \n");
		for (int i = 0; i < nizNamirnica.length; i++) {
			if (nizNamirnica[i] != null) {
				sb.append(nizNamirnica[i] + "\n");
			}
		}
		return sb.toString();
	}
}
