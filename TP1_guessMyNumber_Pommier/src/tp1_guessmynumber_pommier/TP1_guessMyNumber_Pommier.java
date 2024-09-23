/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_pommier;

import java.util.Random;
import java.util.Scanner;
/**
 * @Auteur Pommier Antoine
 * @Groupe TDC
 * @Role du programe Devinez mon nombre
 * @Date 23/09/2024
 */
public class TP1_guessMyNumber_Pommier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random generateurAleat = new Random();
        int n;
        n = generateurAleat.nextInt(100);
        Scanner sc = new Scanner(System.in);
        int ValeurJoueur;
        System.out.println("Entrer un nombre : ");
        ValeurJoueur = sc.nextInt();
        int Compteur = 0;
        while (n != ValeurJoueur) {
            if (n<ValeurJoueur) {
                System.out.println("Trop Grand");
                ValeurJoueur = sc.nextInt();
                Compteur += 1;
            } else { 
                System.out.println("Trop Petit");
                ValeurJoueur = sc.nextInt();
                Compteur += 1;
            }
        }
        System.out.println("Bravo, vous avez gagne, le nombre a deviner etait : "+n+". Vous avez trouve le nombre apres : "+Compteur+" tentatives");
        
    }
    
}
