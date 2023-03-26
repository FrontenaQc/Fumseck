package Paie;

import Main.Employe;
import Temps.Date;

public class AvisDeTropPayes {

	private Employe emp;

	private Date dateEmissionOfficielle;

	private Date dateEcheance;

	private TropPaye listeTropPayes;

	public Date getDateEmission() {
		return dateEmissionOfficielle;
	}

	public Date getDateEcheance() {
		return dateEcheance;
	}

	public TropPaye getListeTropPayes() {
		return listeTropPayes;
	}

}
