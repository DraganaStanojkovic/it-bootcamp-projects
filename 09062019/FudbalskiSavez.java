package fudbalskiSavez;

import java.sql.*;

public class FudbalskiSavez {
	String connectionString;
	Connection con;

	public FudbalskiSavez(String conStr) {
		connectionString = conStr;
	}

	public void connect() {
		try {
			con = DriverManager.getConnection(connectionString);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void disconnect() {
		try {
			if (con != null && !con.isClosed()) {
				con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void fudbalerTim() {
		try {
			String upit = " SELECT Fudbaler.Ime, Tim.Naziv FROM Fudbaler, Tim  WHERE Fudbaler.IdTim=Tim.IdTim";

			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(upit);

			while (rs.next()) {
				String ime = rs.getString(1);
				String tim = rs.getString(2);

				System.out.println(ime + " || " + tim);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void fudbaleriMU() {
		try {
			String upit = " SELECT Fudbaler.Ime FROM Fudbaler, Tim  WHERE Fudbaler.IdTim=Tim.IdTim and Tim.Naziv = 'Manchester United'";

			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(upit);

			while (rs.next()) {
				String ime = rs.getString(1);

				System.out.println(ime);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void golovi() {
		try {
			String upit = " SELECT Fudbaler.Ime, COUNT(Gol.idGol) FROM Fudbaler, Gol WHERE Fudbaler.IdFud=Gol.IdFud "
					+ " GROUP by Gol.IdFud";

			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(upit);

			while (rs.next()) {
				String ime = rs.getString(1);
				int golovi = rs.getInt(2);

				System.out.println(ime + " || broj golova: " + golovi);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void fudbalerSaNajviseGolova() {
		String upit = " SELECT Fudbaler.Ime, max(brgolova.golovi)\n" + "FROM Fudbaler, \n" + "(\n"
				+ " SELECT Fudbaler.Ime, COUNT (Gol.IdFud) as golovi\n" + "from Fudbaler, Gol\n"
				+ " WHERE Fudbaler.IdFud = Gol.IdFud\n" + "GROUP by Fudbaler.IdFud\n" + ") brgolova";
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(upit);

			System.out.println("Fudbaler sa najvise golova je: " + rs.getString(1) + " (" + rs.getInt(2) + " gola)");
		} catch (Exception e) {
		}
	}

	public void kartoni() {
		try {

			String upit = " SELECT fudbaler.Ime, "
					+ "( SELECT COUNT (Karton.IdFud) FROM Karton WHERE Fudbaler.IdFud = Karton.IdFud and Karton.Tip = 'zuti karton') as zutikarton, "
					+ "( SELECT COUNT(Karton.IdFud) FROM Karton WHERE Fudbaler.IdFud = Karton.IdFud and Karton.Tip = 'crveni karton') as crvenikarton "
					+ " FROM Fudbaler";
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(upit);

			while (rs.next()) {
				String ime = rs.getString(1);
				int brojZutih = rs.getInt(2);
				int brojCrvenih = rs.getInt(3);

				System.out.println(ime + " || zuti kartoni: " + brojZutih + " || crveni kartoni: " + brojCrvenih);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void gdeJeFudbalerIgrao(int id) {
		try {
			String upit = " SELECT  sve.Mesto " + " FROM " + "( SELECT * " + " FROM Igrao " + " LEFT JOIN "
					+ "Utakmica " + "on igrao.IdUta = Utakmica.IdUta " + "LEFT JOIN " + "Tim "
					+ "on  tim.IdTim = Utakmica.IdDomacin " + ") sve " + " WHERE sve.idFud = " + id;
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(upit);

			while (rs.next()) {
				String mesto = rs.getString(1);
				System.out.println(mesto);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void dodajFudbalera(String imeFudbalera, String imeTima) {
		int id = 0;
		int idTima = 0;

		try {
			String upitMaxId = " SELECT max(idFud) FROM Fudbaler";
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(upitMaxId);

			id = rs.getInt(1);
			id++;

			String upitIdTima = " SELECT idTim FROM Tim WHERE naziv = '" + imeTima + "' ";
			Statement idTimaStm = con.createStatement();
			ResultSet rsIdTima = idTimaStm.executeQuery(upitIdTima);

			idTima = rsIdTima.getInt(1);

			String insertFudbalerUpit = " INSERT INTO Fudbaler (idFud, Ime, IdTim) VALUES (?,?,?)";

			PreparedStatement ps = con.prepareStatement(insertFudbalerUpit);
			ps.setInt(1, id);
			ps.setString(2, imeFudbalera);
			ps.setInt(3, idTima);

			ps.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void dodajTim(String imeTima, String mesto) {
		int idTima = 0;

		try {
			String upitMaxIdT = " SELECT max(idTim) FROM Tim";
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(upitMaxIdT);

			idTima = rs.getInt(1);
			idTima++;

			String insertTimUpit = " INSERT INTO Tim (idTim, Naziv, Mesto) VALUES (?,?,?)";

			PreparedStatement ps = con.prepareStatement(insertTimUpit);
			ps.setInt(1, idTima);
			ps.setString(2, imeTima);
			ps.setString(3, mesto);

			ps.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void dodajUtakmicu(String gTim, String dTim, int kolo, String ishod, String godina) {
		int idUtakmice = 0;
		int idGT = 0;
		int idDT = 0;

		try {
			String upitMaxIdU = " SELECT max(IdUta) FROM Utakmica";
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(upitMaxIdU);

			idUtakmice = rs.getInt(1);
			idUtakmice++;

			String upitIdGost = " SELECT IdTim FROM Tim WHERE Naziv = '" + gTim + "'";
			Statement stmG = con.createStatement();
			ResultSet rsG = stmG.executeQuery(upitIdGost);

			idGT = rsG.getInt(1);

			String upitIdDomacin = " SELECT IdTim FROM Tim WHERE Naziv = '" + dTim + "'";
			Statement stmD = con.createStatement();
			ResultSet rsD = stmD.executeQuery(upitIdDomacin);

			idDT = rsD.getInt(1);

			String insertTimUpit = "INSERT INTO Utakmica (IdUta, IdDomacin, IdGost, Kolo, Ishod, Godina ) VALUES (?, ?, ?, ?, ?, ?)";

			PreparedStatement ps = con.prepareStatement(insertTimUpit);
			ps.setInt(1, idUtakmice);
			ps.setInt(2, idDT);
			ps.setInt(3, idGT);
			ps.setInt(4, kolo);
			ps.setString(5, ishod);
			ps.setString(6, godina);

			ps.execute();

			dodavanjeUIgrao(idDT, idUtakmice);
			dodavanjeUIgrao(idGT, idUtakmice);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void dodavanjeUIgrao(int tim, int utakmica) {
		try {
			String upitFudbaleri = " SELECT Fudbaler.IdFud\n" + "FROM Fudbaler\n" + " WHERE Fudbaler.IdTim = '" + tim
					+ "'";

			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(upitFudbaleri);

			while (rs.next()) {
				int Fudbaler = rs.getInt(1);
				String upit = "INSERT INTO Igrao (IdFud, IdUta, PozicijaFudbalera ) VALUES (?, ?, ?)";

				PreparedStatement ps = con.prepareStatement(upit);
				ps.setInt(1, Fudbaler);
				ps.setInt(2, utakmica);
				ps.setInt(3, 0);

				ps.execute();
			}
		} catch (Exception e) {
		}
	}

	public void obrisiTim(String nazivTima) {
		try {
			String upitIdTima = " SELECT Tim.IdTim\n" + "FROM Tim\n" + "WHERE Tim.Naziv = '" + nazivTima + "'";
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(upitIdTima);

			int idTima = rs.getInt(1);

			String upitFudbaleri = " SELECT Fudbaler.IdFud\n" + "FROM Fudbaler\n" + "WHERE Fudbaler.IdTim = '" + idTima
					+ "'";
			Statement st = con.createStatement();
			ResultSet rsFudbaleri = st.executeQuery(upitFudbaleri);

			while (rsFudbaleri.next()) {
				int idFudbaler = rsFudbaleri.getInt(1);
				obrisiUtakmice(idFudbaler);
				obrisiFudbalera(idFudbaler);
			}

			String deleteTimUpit = " DELETE FROM Tim WHERE IdTim = " + idTima;
			Statement stDeleteTim = con.createStatement();
			stDeleteTim.executeUpdate(deleteTimUpit);
		} catch (Exception e) {
		}
	}

	private void obrisiUtakmice(int fudbaler) {
		try {
			String upit = " SELECT DISTINCT Igrao.IdUta\n" + " FROM Igrao\n" + " WHERE Igrao.IdFud = " + fudbaler;

			Statement st = con.createStatement();
			ResultSet rsUtakmice = st.executeQuery(upit);
			while (rsUtakmice.next()) {
				int utakmica = rsUtakmice.getInt(1);
				String deleteUpit = " DELETE FROM Utakmica WHERE idUta = " + utakmica;
				Statement deleteSt = con.createStatement();
				deleteSt.executeUpdate(deleteUpit);

				obrisiUtakmicuIzTabele("Karton", utakmica);
				obrisiUtakmicuIzTabele("Gol", utakmica);
				obrisiUtakmicuIzTabele("Igrao", utakmica);
			}
		} catch (Exception e) {
		}
	}

	private void obrisiUtakmicuIzTabele(String tabela, int utakmica) {
		try {
			String deleteUpit = " DELETE FROM " + tabela + " WHERE idUta = " + utakmica;
			Statement deleteSt = con.createStatement();
			deleteSt.executeUpdate(deleteUpit);
		} catch (Exception e) {
		}
	}

	private void obrisiFudbalera(int idFudbalera) {
		try {
			String deleteUpit = " DELETE FROM Fudbaler WHERE IdFud = " + idFudbalera;
			Statement deleteSt = con.createStatement();
			deleteSt.executeUpdate(deleteUpit);
		} catch (Exception e) {
		}
	}

}
