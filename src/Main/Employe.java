package Main;

import Paie.BulletinPaie;
import Temps.Date;

import java.time.LocalDate;

public class Employe extends Utilisateur {
    private final String matricule;
    private final int NAS;
    private final LocalDate dateEmbauche; //Date
    private Province provinceEmploi;
    private String profession;
    private float tauxHoraire;
    private double salaireAnnuel;
    private BulletinPaie dernierePaie;

    Employe(int NAS, float tauxHoraire, Province provinceEmploi){
        super();
        //this.matricule est donné par la bd.
        this.matricule = "";
        this.tauxHoraire = tauxHoraire;
        this.salaireAnnuel = tauxHoraire * 40 * 50;
        this.NAS = NAS;
        this.provinceEmploi = provinceEmploi;
        this.dateEmbauche = LocalDate.now();
    }

    public String getMatricule() {
        return matricule;
    }
    public int getNAS(){ return NAS;}
    public float getTauxHoraire() {
        return tauxHoraire;
    }
    public LocalDate getDateEmbauche(){ return dateEmbauche;}
    public String getProfession(){ return profession;}
    public Province getProvinceEmploi(){ return provinceEmploi;}
    public double getSalaireAnnuel(){ return tauxHoraire * 40 * 50;}
    public BulletinPaie getDernierePaie(){ return dernierePaie;}
    public void consulterBulletinPaie(String id) {
    }
    public void demanderAugmentation(double augmentation) {
    }
    public void demanderCongePaye(Date periode) {
    }
    public void faireReclamationSalaire(Date periodePaie) {
    }
    public void signalerErreurPaie(String idBulletinPaie) {
    }
    public void modifierEmploiDuTemps() {
    }
    public void afficherEmploiDuTemps() {
    }
}
