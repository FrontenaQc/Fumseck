package Main;

public class Adresse {

	private int noPorte;

	private String nomRue;

	private Province province;

	private String codePostale;

	Adresse(int noPorte, String nomRue, Province province, String codePostale){
		this.noPorte = noPorte;
		this.nomRue = nomRue;
		this.province = province;
		this.codePostale = codePostale;
	}


	/* Getters & Setters */
	public Adresse getAdresse(){return this;}

	public int getNoPorte() {return noPorte;}

	public String getNomRue() {return nomRue;}

	public Province getProvince() {return province;}

	public String getCodePostale() {return codePostale;}

	@Override
	public String toString(){
		return this.noPorte + ' ' + this.nomRue + ' ' + this.province + ' ' + this.codePostale;
	}

}
