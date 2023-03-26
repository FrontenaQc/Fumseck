package Main;

public class Employeur {

	private String nom;

	private Adresse adresse;

	Employeur(String nom, Adresse adresse){
		this.nom = nom;
		this.adresse = adresse;
	}

	public String getNom() {
		return nom;
	}

	public Adresse getAdresse() { return adresse;}

}
