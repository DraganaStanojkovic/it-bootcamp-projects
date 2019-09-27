package tovar;

import java.util.ArrayList;

public class Kamion {
	private String regBr;
	private ArrayList<Tovar> tovar;
	private double nosivost;
	private double teret;

	public Kamion(String redBr, double nosivost) {
		super();
		this.regBr = redBr;
		this.nosivost = nosivost;
		tovar = new ArrayList<Tovar>();
		this.teret = 0;
	}

	public boolean stavi(Tovar tovar) {
		if ((teret + tovar.tezina()) > nosivost) {
			return false;
		}
		this.tovar.add(tovar);
		teret += tovar.tezina();
		return true;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(regBr);
		sb.append("(" + teret + "/" + nosivost + ")\n");
		for (Tovar t : tovar) {
			sb.append(" " + t + "\n");
		}
		return sb.toString();
	}

}
