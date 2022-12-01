package Parking;

class Vehicule {
    private String noMatricule;
    private String color;

    // GETTERS
    public String getNoMatricule() {
        return noMatricule;

    }

    public String getColor() {
        return color;
    }
    // SETTERS

    public void setNoMatricule(String noMaString) {
        this.noMatricule = noMaString;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Constructeur
    public Vehicule(String noString, String color) {
        this.color = color;
        this.noMatricule = noString;

    }

    // Constucteur par de defaut
    public Vehicule() {

    }

}