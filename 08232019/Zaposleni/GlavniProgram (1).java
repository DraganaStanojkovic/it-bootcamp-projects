package Hijerarhija;

import java.time.LocalDate;

public class GlavniProgram {

	public static void main(String[] args) {

		Student s1 = new Student("Mila", "Vukosavljevic", LocalDate.of(1999, 1, 15), 1, 10);

		StudentOsnovnihStudija sos = new StudentOsnovnihStudija("Vlada", "Stankovic", LocalDate.of(1998, 5, 1), 2, 9,
				"drumski saobracaj");

		StudentMasterStudija mos = new StudentMasterStudija("Vidan", "Stanic", LocalDate.of(1997, 9, 2), 2, 6.5,
				"vazdusni saobracaj");

		Zaposleni z1 = new Zaposleni("Mara", "Drazic", LocalDate.of(1970, 12, 5), LocalDate.of(2000, 11, 3), 80000.0);

		Nastavnik n1 = new Nastavnik("Milan", "Dobrica", LocalDate.of(1965, 1, 5), LocalDate.of(2000, 11, 3), 120000.0,
				"matematika", "matematika, fizika, elektrotehnika");

		Profesor p1 = new Profesor("Milica", "Dobric", LocalDate.of(1980, 2, 12), LocalDate.of(2000, 3, 3), 120000.0,
				"elektrotehnika", "matematika, fizika, elektrotehnika", "dekan");

		Asistent a1 = new Asistent("Mila", "Vujovic", LocalDate.of(1990, 2, 11), LocalDate.of(2000, 3, 3), 100000.0,
				"elektrotehnika", "matematika, fizika, elektrotehnika",
				"doktorske studije- telekomunikacioni saobracaj");

		Sluzbenik sl1 = new Sluzbenik("Ivan", "Dragovic", LocalDate.of(1970, 1, 15), LocalDate.of(2005, 1, 16), 70000.0,
				"postanski saobracaj");

		System.out.println(s1.toString() + "\n");
		System.out.println(sos.toString() + "\n");
		System.out.println(mos.toString() + "\n");
		System.out.println(z1.toString() + "\n");
		System.out.println(n1.toString() + "\n");
		System.out.println(p1.toString() + "\n");
		System.out.println(a1.toString() + "\n");
		System.out.println(sl1.toString() + "\n");
	}

}
