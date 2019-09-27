package polica;

public class GlavniProgram {

	public static void main(String[] args) {
		List list1 = new List(1,
				"No, sta je, kneze: Djenova i Luka ispadose sad kao neki spahiluci Bonapartine porodice? ");
		List list2 = new List(2,
				"A praznik kod engleskog poslanika? Danas je sreda, moram se i tamo pojaviti- rece knez.- Moja kci ce doci po mene da se zajedno odvezemo.");
		List list3 = new List(1,
				"Sve srecne porodice lice jedna na drugu, svaka nesrecna porodica nesrecna je na svoj nacin.");


		Knjiga k1 = new Knjiga("Rat i mir, I deo");
		k1.setList(list1);
		k1.setList(list2);

		Knjiga k2 = new Knjiga("Ana Karenjina");
		k2.setList(list3);

		Polica p1 = new Polica();
		p1.setKnjiga(k1);
		p1.setKnjiga(k2);
		System.out.println(p1.toString());
		
		
		

	}

}
