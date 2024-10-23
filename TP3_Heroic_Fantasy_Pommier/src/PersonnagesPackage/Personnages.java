/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PersonnagesPackage;

import java.util.ArrayList;
import ArmesPackage.Armes;

/**
 *
 * @author pommi
 */
public abstract class Personnages {

    String nom;
    int NiveauVie;
    private ArrayList<Armes> inventaire;
    private Armes ArmesMain;

    public Personnages(String nom, int NiveauVie) {
        this.nom = nom;
        this.NiveauVie = NiveauVie;
        this.inventaire = new ArrayList<>();
        this.ArmesMain = null;
    }

    public int NiveauViePersonnage() {
        return NiveauVie;
    }

    public String NomPersonnage() {
        return nom;
    }

    public void ajouterArme(Armes Armes) {
        if (inventaire.size() < 5) {
            inventaire.add(Armes);
            System.out.println(Armes.NomArmes() + " ajoutée à l'inventaire.");
        } else {
            System.out.println("Inventaire plein, impossible d'ajouter l'arme.");
        }
    }

    public void equiperArme(String nomArme) {
        for (Armes Armes : inventaire) {
            if (Armes.NomArmes().equals(nomArme)) {
                ArmesMain = Armes;
                System.out.println(nomArme + " est maintenant équipée.");
                return;
            }
        }
        System.out.println("L'arme " + nomArme + " n'est pas dans l'inventaire.");
    }

    public Armes getArmesMain() {
        return ArmesMain;
    }

    @Override
    public String toString() {
        String description = "Nom : " + nom + ", Niveau : " + ArmesMain.NiveauArmes();
        if (ArmesMain != null) {
            description += ", Arme en main : " + ArmesMain.NomArmes() + " (Puissance : " + ArmesMain.NiveauArmes() + ")";
        } else {
            description += ", Pas d'arme équipée.";
        }
        return description;
    }

    public int compterArmesDePredilection(Class<? extends Armes> typeArme) {
        int compteur = 0;
        for (Armes arme : inventaire) {
            if (typeArme.isInstance(arme)) {
                compteur++;
            }
        }
        return compteur;
    }
}
