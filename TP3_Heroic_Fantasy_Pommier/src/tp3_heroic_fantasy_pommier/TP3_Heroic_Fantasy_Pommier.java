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
        Epee excalibur = new Epee("Excalibur",7,5);
        Epee durandal = new Epee("Durandal",4,7);
        Epee fauxmortuaire = new Epee("Faux Mortuaire",12,8);
        Baton chene = new Baton("Chene",4,5);
        Baton charme = new Baton("Charme",5,6);
        Baton lamedelenora = new Baton ("Lame de l enora",6,4);
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
        Magicien gandalf = new Magicien("Gandalf",65,true);
        Magicien garcimore = new Magicien("Garcimore",44,false);
        Guerrier conan = new Guerrier("Conan",78,false);
        Guerrier lannister = new Guerrier("Lannister",45,true);
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
        conan.equiperArme("excalibur");
        System.out.println("Nombre d'armes de predilection : " + conan.compterArmesDePredilection("Epee"));

}
}
    