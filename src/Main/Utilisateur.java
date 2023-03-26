package Main;

public class Utilisateur {

	private String nom;

	private String prenom;

	private String identifiant;

	private String motDePasse;

	public Utilisateur(String nom, String prenom){
		this.nom = nom;
		this.prenom = prenom;
	}

	public Utilisateur() {

	}

	public String getFullName() {
		return "prenom" + ' ' + "nom";
	}

	public String getNom(){ return nom;}

	public String getPrenom(){ return prenom;}

	public String getIdentifiant() {
		return null;
	}

	public void modifierMDP(String newPassword) {

	}

}
