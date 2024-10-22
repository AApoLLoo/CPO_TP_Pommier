/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_pommier;

/**
 *
 * @author pommi
 */
public class Voiture {
    String Modele;
    String Marque;
    int PuissanceCv;
    Personne proprietaire;
    
    public Voiture(String Modele, String Marque, int PuissanceCv) {
    this.Modele=Modele;
    this.Marque=Marque;
    this.PuissanceCv=PuissanceCv;
    this.proprietaire = null;
    }
    public void ajoutPropietaire(Personne proprietaire){
        this.proprietaire = proprietaire;
    }
    @Override
    public String toString() {
        return "Modèle : " + Modele + " / Marque : " + Marque+ " / Puissance cheveaux : " + PuissanceCv;

    }
}
