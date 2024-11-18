/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PersonnagesPackage;

import java.util.ArrayList;
import ArmesPackage.Armes;
import tp3_heroic_fantasy_pommier.etreVivant;

/**
 *
 * @author pommi
 */
public abstract class Personnages implements etreVivant{
    private final String nom;
    int NiveauVie;
    public final ArrayList<Armes> inventaire;
    Armes ArmesMain;
    private static int nombresPersonnages = 0;
    static int nombresGuerriers = 0;
    static int nombresMagiciens;

    public Personnages(String nom, int NiveauVie) {
        this.nom = nom;
        this.NiveauVie = NiveauVie;
        this.inventaire = new ArrayList<>();
        this.ArmesMain = null;
        nombresPersonnages++;
    }
    @Override
    public void seFatiguer(){
        NiveauVie -= 10;
    }
    @Override
    public boolean estVivant(){
        return NiveauVie > 0;
    }
    @Override
    public void estAttaque(int points){
        NiveauVie -= points;
    }
    @Override
    public void finalize(){
        nombresPersonnages--;
    }
    public void attaque(Personnages autre){
    }
    public static int getNombresPersonnages(){
        return nombresPersonnages;
    }
    public static int getNombresGuerriers(){
       return nombresGuerriers;
   }
    public static int getNombresMagiciens(){
        return nombresMagiciens;
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
            System.out.println(Armes.NomArmes() + " ajoutee a l'inventaire de "+ NomPersonnage());
            
        } else {
            System.out.println("Inventaire plein, impossible d'ajouter l'arme.");
        }
    }

    public void equiperArme(Armes nomArme) {
        for (Armes arme : inventaire) {
            if (arme == nomArme) {                                        
                ArmesMain = arme;
                System.out.println("Arme trouvee et equipee : " + ArmesMain);
                return;
            }
        }
        System.out.println("Arme " + nomArme + " non trouvee dans l'inventaire.");
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

    public int compterArmesDePredilection(String typePredilection) {
        int compteur = 0;
        for (Armes arme : inventaire) {
            String type = arme.getClass().getSimpleName();
            System.out.println(type);
            if (type == typePredilection) {
                compteur++;
            }
        }
        return compteur;
    }
}
