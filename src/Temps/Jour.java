package Temps;

import Temps.Date;
import Temps.Day;

public class Jour {

	private Hour heureDebut;

	private Hour heureFin;

	private Day jour;

	private boolean estUnConge;

	public Hour getHeureDebut() {
		return heureDebut;
	}

	public Hour getHeureFin() {
		return heureFin;
	}

	public Day getJour() {
		return jour;
	}

	public boolean getEstUnConge(){ return estUnConge;}
}
