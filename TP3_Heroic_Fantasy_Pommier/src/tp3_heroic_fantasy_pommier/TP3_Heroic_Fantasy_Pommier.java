/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_pommier;
import Personnages.Magicien;
import Personnages.Personnages;
import Personnages.Guerrier;
import Armes.Baton;
import Armes.Epee;
import Armes.Armes;
import java.util.ArrayList;
/**
 *
 * @author pommi
 */
public class TP3_Heroic_Fantasy_Pommier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Armes> listeArmes = new ArrayList<>();
        Epee excalibur = new Epee("Excalibur",7,5);
        Epee durandal = new Epee("Durandal",4,7);
        Baton chene = new Baton("Chêne",4,5);
        Baton charme = new Baton("Charme",5,6);
        System.out.println(excalibur);
        listeArmes.add(excalibur);
        listeArmes.add(durandal);
        listeArmes.add(chene);
        listeArmes.add(charme);
        System.out.println("La liste contient " + listeArmes.size() + " elements");
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
}
}
    