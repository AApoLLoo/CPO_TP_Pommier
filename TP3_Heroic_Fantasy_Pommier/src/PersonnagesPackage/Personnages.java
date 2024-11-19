/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PersonnagesPackage;

import java.util.ArrayList;
import ArmesPackage.Armes;
import ArmesPackage.Baton;
import ArmesPackage.Epee;
import tp3_heroic_fantasy_pommier.etreVivant;

/**
 *
 * @author pommi
 */
public abstract class Personnages implements etreVivant {

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
    public void seFatiguer() {
        NiveauVie -= 10;
    }

    @Override
    public boolean estVivant() {
        return NiveauVie > 0;
    }

    @Override
    public void estAttaque(int points) {
        NiveauVie -= points;
    }

    @Override
    public void finalize() {
        nombresPersonnages--;
    }

    public void attaque(Personnages autre) {
    }

    public static int getNombresPersonnages() {
        return nombresPersonnages;
    }

    public static int getNombresGuerriers() {
        return nombresGuerriers;
    }

    public static int getNombresMagiciens() {
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
            System.out.println(Armes.NomArmes() + " ajoutee a l'inventaire de " + NomPersonnage());

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

    public void attaquer(Personnages autre) {
        int degats = 0;
        if (ArmesMain != null) {
            // Si c'est un magicien utilisant un bâton
            if (this instanceof Magicien && ArmesMain instanceof Baton) {
                Baton baton = (Baton) ArmesMain;
                degats = baton.NiveauArmes() * baton.getAgeBaton();  // Calcul des dégâts avec l'âge du bâton
            } // Si c'est un guerrier utilisant une épée
            else if (this instanceof Guerrier && ArmesMain instanceof Epee) {
                Epee epee = (Epee) ArmesMain;
                degats = epee.NiveauArmes() * epee.getFinesse();  // Calcul des dégâts avec la finesse de l'épée
            }

            // Fatigue du personnage après une attaque
            this.seFatiguer();

            // Si le personnage est un magicien confirmé, ou un guerrier à cheval, diviser les dégâts par 2
            if ((this instanceof Magicien && ((Magicien) this).MagicienConfirme())
                    || (this instanceof Guerrier && ((Guerrier) this).GuerrierCheval())) {
                degats /= 2;  // Réduction des dégâts de moitié
            }

            // Le personnage attaque l'autre personnage et lui inflige des dégâts
            autre.estAttaque(degats);
            System.out.println(this.nom + " inflige " + degats + " degats a " + autre.nom);
        } else {
            System.out.println(this.nom + " n'a pas d'arme equipee et ne peut pas attaquer !");
        }
    }


    public int compterArmesDePredilection() {
        int compteur = 0;
        for (Armes arme : inventaire) {
            if ((this instanceof Guerrier && arme instanceof Epee)
                    || (this instanceof Magicien && arme instanceof Baton)) {
                compteur++;
            }
        }
        return compteur;
    }
}
