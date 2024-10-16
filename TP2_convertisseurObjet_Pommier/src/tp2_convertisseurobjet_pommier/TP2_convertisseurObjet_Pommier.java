/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_pommier;

import java.util.Scanner;

/**
 *
 * @author pommi
 */
public class TP2_convertisseurObjet_Pommier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Convertisseur convertisseur = new Convertisseur();
        Scanner scanner = new Scanner(System.in);
        boolean continuer = true;
        while (continuer) {
            System.out.println("Menu :");
            System.out.println("1. Convertir Celsius en Fahrenheit");
            System.out.println("2. Convertir Fahrenheit en Celsius");
            System.out.println("3. Convertir Celsius en Fahrenheit");
            System.out.println("4. Convertir Fahrenheit en Celsius");
            System.out.println("5. Convertir Celsius en Fahrenheit");
            System.out.println("6. Convertir Fahrenheit en Celsius");            
            System.out.println("7. Afficher le nombre de conversions");
            System.out.println("8. Quitter");
            System.out.print("Choisissez une option : ");

            int choix = scanner.nextInt();
            float valeur;

            switch (choix) {
                case 1:
                    System.out.print("Entrez la température en Celsius : ");
                    valeur = scanner.nextFloat();
                    System.out.println("Résultat : " + convertisseur.CelsiusVersFahrenheit(valeur));
                    break;
                case 2:
                    System.out.print("Entrez la température en Fahrenheit : ");
                    valeur = scanner.nextFloat();
                    System.out.println("Résultat : " + convertisseur.FahrenheitVersCelsius(valeur));
                    break;
                case 3:
                    System.out.print("Entrez la température en Celsius : ");
                    valeur = scanner.nextFloat();
                    System.out.println("Résultat : " + convertisseur.KelvinVersCelsisus(valeur));
                    break;
                case 4:
                    System.out.print("Entrez la température en Fahrenheit : ");
                    valeur = scanner.nextFloat();
                    System.out.println("Résultat : " + convertisseur.CelsiusVersKelvin(valeur));
                    break;
                case 5:
                    System.out.print("Entrez la température en Celsius : ");
                    valeur = scanner.nextFloat();
                    System.out.println("Résultat : " + convertisseur.KelvinVersFarenheit(valeur));
                    break;
                case 6:
                    System.out.print("Entrez la température en Fahrenheit : ");
                    valeur = scanner.nextFloat();
                    System.out.println("Résultat : " + convertisseur.FarenheitVersKelvin(valeur));
                    break;
                case 7:
                    System.out.println(convertisseur);
                    break;
                case 8:
                    continuer = false;
                    break;
                default:
                    System.out.println("Option non valide. Réessayez.");
            }
        }

        scanner.close();
    }
}

