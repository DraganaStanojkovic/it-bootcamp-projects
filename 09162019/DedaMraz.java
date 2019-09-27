package domacimape;

import java.util.ArrayList;
import java.util.HashMap;

public class DedaMraz {

	public static void main(String[] args) {
		ArrayList<String> svaDeca = new ArrayList<String>();
		ArrayList<String> dobraDeca = new ArrayList<String>();

		svaDeca.add("Milan");
		svaDeca.add("Vesna");
		svaDeca.add("Vladimir");
		svaDeca.add("Katarina");

		dobraDeca.add("Milan");
		dobraDeca.add("Vesna");
		dobraDeca.add("Milan");
		dobraDeca.add("Vladimir");

		HashMap<String, Integer> lista = listaDedaMraza(svaDeca, dobraDeca);
		for (String dete : lista.keySet()) {
			if (lista.get(dete) > 0) {
				System.out.println(dete + " " + lista.get(dete));
			}
		}

	}

	public static HashMap<String, Integer> listaDedaMraza(ArrayList<String> svaDeca, ArrayList<String> dobraDeca) {
		HashMap<String, Integer> listaDobrihDela = new HashMap<String, Integer>();
		for (String dete : svaDeca) {
			int brojac = 0;
			for (String dobroDete : dobraDeca) {
				if (dete.equals(dobroDete)) {
					brojac++;
				}
			}
			listaDobrihDela.put(dete, brojac);
		}
		return listaDobrihDela;
	}
}
