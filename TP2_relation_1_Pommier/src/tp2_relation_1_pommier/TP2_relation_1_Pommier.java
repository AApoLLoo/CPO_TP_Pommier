/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_pommier;

/**
 * @Auteur Pommier Antoine
 * @Groupe TDC
 * @Role du programe
 * @Date 23/10/2024
 */
public class TP2_relation_1_Pommier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Voiture uneClio = new Voiture("Clio", "Renault", 5);
        Voiture uneAutreClio = new Voiture("Clio", "Renault", 5);
        Voiture une2008 = new Voiture("2008", "Peugeot", 6);
        Voiture uneMicra = new Voiture("Micra", "Nissan", 4);
        Voiture unePorsche = new Voiture("911", "Prosche", 18);
        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");
        System.out.println("liste des voitures disponibles : \n" + uneClio + "\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra + "\n" + unePorsche);
        // bob.listeVoitures[0]= uneClio;
        // bob.nbVoitures = 1;
        // uneClio.proprietaire = bob;
        bob.ajoutVoiture(uneAutreClio);
        bob.ajoutVoiture(unePorsche);
        bob.ajoutVoiture(uneMicra);
        reno.ajoutVoiture(une2008);
        reno.ajoutVoiture(uneMicra);
        System.out.println(bob.ajoutVoiture(une2008));
        System.out.println("La première voiture de Bob est la suivante : " + bob.listeVoitures[0]);
        System.out.println("Les voitures de Bob : " + "\n" + bob.getListeVoitures() + ". Il a donc un total de " + bob.nbVoitures + " dans son garage.");
        System.out.println("Les voitures de Bob : " + "\n" + reno.getListeVoitures() + ". Il a donc un total de " + reno.nbVoitures + " dans son garage.");
        System.out.println("Le propriétaire de la porsche est : " + unePorsche.proprietaire);
    }
}
