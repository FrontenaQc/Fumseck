package Paie;

import Temps.Date;
import Temps.Year;

public class BulletinPaie {

	private String id;

	private double paieBrutte;

	private double deductionsTotales;

	private double paieNette;

	private double tauxHoraire;

	private Date datePayable;

	private Date ppDebut;

	private Date ppFin;

	private Year anneeFiscale;

	private float NbHeuresTravaillees;

	BulletinPaie(){

	}

	public String getId() {
		return id;
	}

	public Date getDatePayable() {
		return datePayable;
	}

	public double getTauxHoraire() {
		return tauxHoraire;
	}

	public double calculerImpots() {
		return 0;
	}

	public double calculerSalaireBrut() {
		return 0;
	}

	public double calculerSalaireNette() {
		return 0;
	}

	public void afficherBulletinPaie() {

	}

}
