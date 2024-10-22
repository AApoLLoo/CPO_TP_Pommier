/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_pommier;

/**
 *
 * @author pommi
 */
public class Personne {
    String nom;
    String prenom;
    Voiture[] listeVoitures;
    int nbVoitures;
    
    public Personne(String nom, String prenom){
        this.nom = nom;
        this.prenom = prenom;
        this.listeVoitures = new Voiture[3];
        this.nbVoitures = 0;
    }
    
    public boolean ajoutVoiture(Voiture voiture_a_ajouter) {
        if (voiture_a_ajouter.proprietaire != null) {
            return false; // La voiture a déjà un propriétaire
        }
        if (nbVoitures >= 3) {
            return false; // Le tableau est plein
        }
        listeVoitures[nbVoitures] = voiture_a_ajouter;
        nbVoitures++;
        voiture_a_ajouter.proprietaire = this;
        return true;
    }
    public String getListeVoitures() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nbVoitures; i++) {
            sb.append(listeVoitures[i]).append(", ");
        }
        return sb.length() > 0 ? sb.substring(0, sb.length() - 2) : "";
    }
    @Override
    public String toString() {
        return nom +" "+ prenom;
    }
}
