/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_pommier;

import PersonnagesPackage.Magicien;
import PersonnagesPackage.Personnages;
import PersonnagesPackage.Guerrier;
import ArmesPackage.Baton;
import ArmesPackage.Epee;
import ArmesPackage.Armes;
import java.util.ArrayList;

/**
 * @Auteur Pommier Antoine
 * @Groupe TDC
 * @Role du programe
 * @Date 06/11/2024
 */
public class TP3_Heroic_Fantasy_Pommier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Armes> listeArmes = new ArrayList<>();
        Epee excalibur = new Epee("Excalibur", 50, 12);
        Epee durandal = new Epee("Durandal", 43, 12);
        Epee fauxmortuaire = new Epee("Faux Mortuaire", 65, 42);
        Baton chene = new Baton("Chene", 70, 41);
        Baton charme = new Baton("Charme", 62, 41);
        Baton lamedelenora = new Baton("Lame de l enora", 17, 58);
        System.out.println(excalibur);
        listeArmes.add(excalibur);
        listeArmes.add(durandal);
        listeArmes.add(fauxmortuaire);
        listeArmes.add(chene);
        listeArmes.add(charme);
        listeArmes.add(lamedelenora);
        // System.out.println("La liste contient " + listeArmes.size() + " elements");
        for (int i = 0; i < listeArmes.size(); i++) {
            System.out.println(listeArmes.get(i));
        }
        Magicien gandalf = new Magicien("Gandalf", 50, true);
        Magicien garcimore = new Magicien("Garcimore", 50, false);
        Guerrier conan = new Guerrier("Conan", 100, false);
        Guerrier lannister = new Guerrier("Lannister", 100, true);
        ArrayList<Personnages> listePersonnages = new ArrayList<>();
        listePersonnages.add(gandalf);
        listePersonnages.add(garcimore);
        listePersonnages.add(conan);
        listePersonnages.add(lannister);
        System.out.println("La liste contient " + listePersonnages.size() + " elements");
        for (int i = 0; i < listePersonnages.size(); i++) {
            System.out.println(listePersonnages.get(i));
        }
        conan.ajouterArme(excalibur);
        conan.ajouterArme(durandal);
        conan.ajouterArme(lamedelenora);
        gandalf.ajouterArme(chene);
        gandalf.ajouterArme(charme);
        gandalf.ajouterArme(fauxmortuaire);
        conan.equiperArme(excalibur);
        conan.equiperArme(durandal);
        //System.out.println(conan.getArmesMain());
        System.out.println("Nombre d'armes de predilection : " + conan.compterArmesDePredilection());
        System.out.println("Nombres de personnages : " + Personnages.getNombresPersonnages());
        System.out.println("Nombres de guerriers : " + Personnages.getNombresGuerriers());
        System.out.println("Nombres de magiciens : " + Personnages.getNombresMagiciens());
        System.out.println(conan);
        conan.seFatiguer();
        System.out.println(conan);
        if (conan.estVivant()) {
            System.out.println("Le guerrier est toujours vivant.");
        } else {
            System.out.println("Le guerrier n'est plus vivant.");
        }
        conan.getArmesMain();
        //conan.attaquer(gandalf);
        System.out.println(gandalf);
        System.out.println(conan.getArmesMain().NiveauArmes());
        gandalf.attaquer(conan);
        System.out.println("Apres l'attaque du magicien :");
        System.out.println(gandalf);
        System.out.println(conan);
        conan.attaquer(gandalf);
        System.out.println("Apres l'attaque du guerrier :");
        System.out.println(gandalf);
        System.out.println(conan);
        System.out.println("Le magicien est-il vivant ? " + gandalf.estVivant());
        System.out.println("Le guerrier est-il vivant ? " + conan.estVivant());
    }
}
