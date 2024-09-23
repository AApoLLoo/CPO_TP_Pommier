/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_pommier;

import java.util.Scanner;

/**
 * @Auteur Pommier Antoine
 * @Groupe TDC
 * @Role du programe Convertir la température
 * @Date 23/09/2024
 */
public class TP1_convertisseur_Pommier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double Valeur1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez un reel ci-dessous : ");
        Valeur1 = sc.nextDouble();
        System.out.println("Le reel est : ");
        int convertion;
        System.out.println("""
                           Saisissez la conversion que vous souhaitez effectuer :
                            (1)De Celsius a Kelvin
                            (2)De Kelvin a Celsius
                            (3)De Farenheit a Celsius
                            (4)De Celsius a Farenheit
                            (5)De Kelvin a Farenheit
                            (6)De Farenheit a Kelvin""");
        convertion = sc.nextInt();
        switch (convertion) {
            case (1) ->
                System.out.println("La temperature en Kelvin est : " + CelsiusVersKelvin(Valeur1) + " K");
            case (2) ->
                System.out.println("La temperature en Kelvin est : " + KelvinVersCelsisus(Valeur1) + " C");
            case (3) ->
                System.out.println("La temperature en Kelvin est : " + FareneitVersCelsius(Valeur1) + " C");
            case (4) ->
                System.out.println("La temperature en Kelvin est : " + CelsiusVersFarenheit(Valeur1) + " F");
            case (5) ->
                System.out.println("La temperature en Kelvin est : " + KelvinVersFarenheit(Valeur1) + " F");
            case (6) ->
                System.out.println("La temperature en Kelvin est : " + FarenheitVersKelvin(Valeur1) + " K");
            default ->
                System.out.println("Entrez un chiffre entre 1 et 5");
        }
    }

    public static double CelsiusVersKelvin(double tCelsius) {
        double Kelvin;
        Kelvin = tCelsius + 273.15;
        return Kelvin;
    }

    public static double KelvinVersCelsisus(double tKelvin) {
        double Celsius;
        Celsius = tKelvin - 273.15;
        return Celsius;
    }

    public static double FareneitVersCelsius(double tFahrenheit) {
        double Celsius;
        Celsius = (tFahrenheit - 32) * (5 / 9);
        return Celsius;
    }

    public static double CelsiusVersFarenheit(double tCelsius) {
        double Farenheit;
        Farenheit = (tCelsius + 32) * (9 / 5);
        return Farenheit;
    }

    public static double KelvinVersFarenheit(double tKelvin) {
        double Farenheit;
        Farenheit = tKelvin * (9 / 5) - 459.67;
        return Farenheit;
    }

    public static double FarenheitVersKelvin(double tFarenheit) {
        double Kelvin;
        Kelvin = tFarenheit * (5 / 9) + 459.67;
        return Kelvin;
    }

}
