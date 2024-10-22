/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_pommier;

import java.util.Random;

/**
 *
 * @author pommi
 */
public class TP2_Manip_Pommier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random generateurAleat = new Random();
        Tartiflette assiette1 = new Tartiflette(500);
        Tartiflette assiette2 = new Tartiflette(600);
        Tartiflette assiette3 = assiette2; // L'objet assiette3 est le même objet que l'objet assiette2.
        System.out.println("nb de calories de Assiette 2 avant inversion : " + assiette2.nbCalories + " Cal");
        System.out.println("nb de calories de Assiette 3 après inversion : " + assiette3.nbCalories + " Cal");
        System.out.println("nb de calories de Assiette 1 avant inversion : " + assiette1.nbCalories + " Cal");
        System.out.println("nb de calories de Assiette 2 après inversion : " + assiette2.nbCalories + " Cal");
        Tartiflette temp = assiette2;
        assiette2 = assiette1;
        assiette1 = temp;
        System.out.println("nb de calories de Assiette 1 après inversion : " + assiette1.nbCalories + " Cal");
        System.out.println("nb de calories de Assiette 2 après inversion : " + assiette2.nbCalories + " Cal");
        //  Moussaka assiette666 = assiette1; est incorrecte nous voulons affeceter une réference à un objet de type Tartiflette à une variable de type Moussaka.
        // Moussaka assiette667 = new Tartiflette(); est également incorrecte pour la même raison. Nous voulons créer un objet de type Tartiflette et de l'affecter à une variable de type Moussaka.
        // Donc non, une référence objet ne peut pas référencer un autre type d'objet qui n'a aucun rapport.
        Moussaka[] tabMoussaka = new Moussaka[10];
        for (int i = 0; i < tabMoussaka.length; i++) {
            int Calories = generateurAleat.nextInt(1000);
            tabMoussaka[i] = new Moussaka(Calories);
        }
        for (int i = 0; i < tabMoussaka.length; i++) {
            System.out.println("Moussaka n° " + (i + 1) + " a pour calories : " + tabMoussaka[i].nbCalories + " Cal");
        }
    }
}
