package Energija;

public class Hrana extends Namirnica {
	private double tezina;
	private double belancevine;
	private double masti;
	private double ugljHidrati;
	private static final double belancevinekJ = 16.7;
	private static final double mastikJ = 37.6;
	private static final double ugljeniHidratikJ = 17.2;

	public Hrana(String ime, double tezina, double belancevine, double masti, double ugljHidrati) {
		super(ime);
		this.tezina = tezina;
		this.belancevine = belancevine;
		this.masti = masti;
		this.ugljHidrati = ugljHidrati;
	}

	public double getTezina() {
		return tezina;
	}

	public double getBelancevine() {
		return belancevine;
	}

	public double getMasti() {
		return masti;
	}

	public double getUgljHidrati() {
		return ugljHidrati;
	}

	public double energVr() {
		double b = tezina * (belancevine / 100) * belancevinekJ;
		double m = tezina * (masti / 100) * mastikJ;
		double uH = tezina * (ugljHidrati / 100) * ugljeniHidratikJ;
		return b + m + uH;

	}
	
	public String toString (){
		StringBuilder sb=new StringBuilder();
		sb.append(super.toString());
		sb.append("(" + tezina + "g" + "," + energVr() + "kJ" + ").");
		return sb.toString();
	}
}
