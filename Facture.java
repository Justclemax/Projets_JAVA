package Parking;

public class Facture {
    int heure_arrivee, heure_de_depart, duree_paye;

    // Construction par defaut
    public Facture() {

    }
    // Constructeur

    public Facture(int heure_arrivee, int heure_de_depart, int duree_paye) {
        this.heure_arrivee = heure_arrivee;
        this.heure_de_depart = heure_de_depart;
        this.duree_paye = duree_paye;

    }

    // GETTERS
    public int getArrivalTime() {
        return heure_arrivee;
    }

    public int getStartTime() {
        return heure_de_depart;

    }

    public int getDuree() {
        return duree_paye;
    }
    // SETTERS

    public void setArrivalTime(int heure_arrivee) {
        this.heure_arrivee = heure_arrivee;

    }

    public void setStartTime(int heure_de_depart) {
        this.heure_de_depart = heure_de_depart;
    }

    public void setDuree(int duree_paye) {
        this.duree_paye = duree_paye;
    }

    // --------------------//
    public void informations() {

        System.out.println(this.getArrivalTime() + "H |" + this.getStartTime() + "H | " + this.getDuree() + "H");
    }
}
