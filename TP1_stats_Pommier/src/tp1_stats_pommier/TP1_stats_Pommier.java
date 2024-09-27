/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_pommier;

import java.util.Scanner;
import java.util.Random;

/**
 * @Auteur Pommier Antoine
 * @Groupe TDC
 * @Role du programe
 * @Date 27/09/2024
 */
public class TP1_stats_Pommier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] Tab = new int[5];
        for (int i = 0; i != 5; i++) {
            Tab[i] = 0;
        }
        Random Gen = new Random();
        Scanner sc = new Scanner(System.in);
        int m;
        int l;
        System.out.println("Entrer un nombre entier : ");
        m = sc.nextInt();
        for (int j = 0; j != m; j++) {
            l = Gen.nextInt(5);
            Tab[l]= j;
        }
        for (int w = 0; w != 5; w++) {
            System.out.println("Tableau : "+Tab[w]);
        }
        for (int k = 0; k != 5; k++){
            double nbr = (Tab[k]*100)/m;
            System.out.println("/n"+"Pourcentage : "+nbr);
        }
    }
}
