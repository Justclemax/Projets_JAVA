package Parking;

import java.util.Scanner;

public class test {
    /**
     * @param aStrings
     */
    public static void main(String[] aStrings) {
        int count;

        Scanner saisie = new Scanner(System.in);
        System.out.println(" Veuillez saisir le nombre de vehicules ");
        count = saisie.nextInt();

        Vehicule liste[] = new Vehicule[count];

        for (int i = 0; i < count; i++) {
            Vehicule voiture = new Vehicule();
            System.out.print("Entrez le numero de matricule du vehicule no " + i + ":");
            String noMatricule = saisie.next();
            voiture.setNoMatricule(noMatricule);

            // -----------------------/

            System.out.print("Entrer la couleur du vehicule no " + i + ":");
            String color = saisie.next();
            voiture.setColor(noMatricule);

        }
        Facture L[] = new Facture[count];
        for (int j = 0; j < count; j++) {
            Facture facture = new Facture();

            // ===L'heure d'arrivee ====
            System.out.print("Entrer l'heure d'arrivee de la voiture no " + j + ":");
            int heure_arrivee = saisie.nextInt();
            facture.setArrivalTime(heure_arrivee);

            // ====La duree payee par le parking ====
            System.out.print("Entrer la duree due du vehicule no " + j + ":");
            int duree_paye = saisie.nextInt();
            facture.setDuree(duree_paye);

            // ------ L'heure de depart -------//
            System.out.print("Entrer l'heure de depart du vehicule no  " + j + " :");
            int heure_de_depart = saisie.nextInt();
            facture.setStartTime(heure_de_depart);
            facture.informations(); // les informations sur la voiture

            ////

            //////// -----ON calucle le nomdre r-------

            int delai = facture.getStartTime() - facture.getArrivalTime();

            ///
            int cout = 1000; // le montant d'amande
            int montant_du = (delai - facture.getDuree());

            System.out.println("Voici le delai = " + delai + " qu'a fait le vehicule no " + j);

            // =Ici on pose la condition si la voiture doit payement ou dont le nombre
            // d'heure
            if (delai > facture.getDuree())
                System.out.println("Le vehicule no " + j + " Doit payer un montant de " + montant_du * cout + "FCFA");
            else
                System.out.println("Pas de payement   ");
            saisie.close();

        }
        saisie.close();
        //

    }

}
