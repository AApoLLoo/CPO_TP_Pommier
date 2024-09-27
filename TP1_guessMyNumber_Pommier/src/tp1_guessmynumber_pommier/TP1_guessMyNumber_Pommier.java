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
        Scanner sc = new Scanner(System.in);
        System.out.println("Décidez d'un niveau de difficulté :" + "/n (1)Facile" + "/n (2)Intermédiaire" + "/n (3)Difficile");
        int Diff;
        Diff = sc.nextInt();
        Random generateurAleat = new Random();
        int n;
        if (Diff == 3){
            n = generateurAleat.nextInt(500);
        }else{
             n = generateurAleat.nextInt(100);
        }
        int ValeurJoueur;
        System.out.println("Entrer un nombre : ");
        ValeurJoueur = sc.nextInt();
        int Compteur = 0;
        while (n != ValeurJoueur) {
            switch (Diff) {
                case 1:
                    if (n < ValeurJoueur) {
                        System.out.println("Trop Grand");
                        ValeurJoueur = sc.nextInt();
                        Compteur += 1;
                    } else if (n < (ValeurJoueur / 2)) {
                        System.out.println("Vraiment Trop Grand");
                        ValeurJoueur = sc.nextInt();
                        Compteur += 1;
                    } else if (n > (ValeurJoueur)) {
                        System.out.println("Vraiment Trop Petit");
                        ValeurJoueur = sc.nextInt();
                        Compteur += 1;
                    } else if (n > (ValeurJoueur / 2)) {
                        System.out.println("Vraiment Trop Petit");
                        ValeurJoueur = sc.nextInt();
                        Compteur += 1;
                    }
                    break;
                case 2:
                    if (n < ValeurJoueur) {
                        System.out.println("Trop Grand");
                        ValeurJoueur = sc.nextInt();
                        Compteur += 1;
                    } else if (n > (ValeurJoueur)) {
                        System.out.println("Trop Petit");
                        ValeurJoueur = sc.nextInt();
                        Compteur += 1;
                    }
                    break;
                case 3:
                    if (n < ValeurJoueur) {
                        System.out.println("Trop Grand");
                        ValeurJoueur = sc.nextInt();
                        Compteur += 1;
                    } else if (n > (ValeurJoueur)) {
                        System.out.println("Vraiment Trop Petit");
                        ValeurJoueur = sc.nextInt();
                        Compteur += 1;
                    }
                    break;
                default:
                    break;
            }
        }
        System.out.println("Bravo, vous avez gagne, le nombre a deviner etait : " + n + ". Vous avez trouve le nombre apres : " + Compteur + " tentatives");
    }
}
