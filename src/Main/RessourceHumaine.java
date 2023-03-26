package Main;

import Temps.Date;
import Employe.FrequenceDePaie;

public class RessourceHumaine extends Utilisateur{

	private String idRessourceHumaine;

	RessourceHumaine(String nom, String prenom) {
		super(nom, prenom);
	}

	public String getId() {
		return idRessourceHumaine;
	}

	public void accepterAugmentationSalaire(Employe emp, double augmentation) {

	}

	public void accepterCongePaye(Employe emp, Date periode) {

	}

	public void ajouterNouvelEmploye(int matricule, String profession, double tauxHoraire, FrequenceDePaie freqPaie) {

	}

	public void modifierFicheEmploye(int matricule) {

	}

}
