package BD;
import Paie.BulletinPaie;
import Main.Employe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//The BaseDeDonnes class is a Singleton.
public class BaseDeDonnees {

	private static final String connectionURL = "jdbc:sqlite:/src/BD/Fumseck.db";

	private BaseDeDonnees() {

	}

	private static class BD {
		private static final BaseDeDonnees INSTANCE = new BaseDeDonnees();
	}

	public static BaseDeDonnees getInstance() {
		return BD.INSTANCE;
	}

	public void createTable(){
		try (Connection conn = DriverManager.getConnection(connectionURL);
			 Statement stmt = conn.createStatement()) {

			String createTableSQL = "CREATE TABLE IF NOT EXISTS users (" +
					"id INTEGER PRIMARY KEY AUTOINCREMENT," +
					"name TEXT NOT NULL," +
					"age INTEGER NOT NULL)";

			stmt.execute(createTableSQL);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}


	public void createEmploye(Employe Emp) {

	}

	public Employe readEmploye(String matriculeEmp) {
		return null;
	}

	public void updateEmploye(Employe EmpModifie) {

	}

	public void updateMdp(String newMdp) {

	}

	public void createBulletinPaie(BulletinPaie Talon) {

	}

	public BulletinPaie readBulletinPaie(String idBulletin) {
		return null;
	}

	public void updateBulletinPaie(BulletinPaie talonModifie) {

	}
}
