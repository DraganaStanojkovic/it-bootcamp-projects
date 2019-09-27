package domacimape;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class SortiranjePoKljucu {

	public static void main(String[] args) {
		HashMap<String, Integer> mapa = new HashMap<String, Integer>();

		mapa.put("Aleksa", 23);
		mapa.put("Bilja", 1);
		mapa.put("Jovica", 35);
		mapa.put("Katarina", 20);
		mapa.put("Svetlana", 19);
		sortiraj(mapa);
	}

	public static void sortiraj(HashMap<String, Integer> mapa) {

		ArrayList<String> sortirana = new ArrayList<String>(mapa.keySet());

		Collections.sort(sortirana);

		for (String s : sortirana) {
			System.out.println(s + " " + mapa.get(s));
		}

	}

}
