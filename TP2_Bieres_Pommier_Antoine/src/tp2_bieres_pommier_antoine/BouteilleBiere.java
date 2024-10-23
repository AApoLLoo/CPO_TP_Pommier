package tp2_bieres_pommier_antoine;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * @Auteur Pommier Antoine
 * @Groupe TDC
 * @Role du programe
 * @Date 11/10/2024
 */
public class BouteilleBiere {
    String nom;
    float degreAlcool;
    String brasserie;
    boolean ouverte;

    public void lireEtiquette() {
        System.out.println("Bouteille de " + nom + " (" + degreAlcool + " degres) \nBrasserie : " + brasserie);
    }

    public boolean Decapsuler(boolean ouverte) {
        if (ouverte == false) {
            ouverte = true;
            return ouverte;
        } else {
            System.out.println("erreur : biere deja ouverte");
            return false;
        }
    }
    public BouteilleBiere(String unNom, float unDegre, String uneBrasserie) {
        nom = unNom;
        degreAlcool = unDegre;
        brasserie = uneBrasserie;
        ouverte = false;
    }

    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = nom + " (" + degreAlcool + " degres)Ouverte ? ";
        if (Decapsuler(ouverte) == true) {
            chaine_a_retourner += " oui";
        }else{ 
            chaine_a_retourner += " non";
        }
        return chaine_a_retourner;
    }
}
