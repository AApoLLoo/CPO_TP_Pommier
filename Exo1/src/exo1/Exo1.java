/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exo1;

import java.util.Scanner;

/**
 * @Auteur  Pommier Antoine!!!!
 * @Groupe  TDC
 * @Role du programe Je sais pas
 * @Date 17/09/2024
 */
public class Exo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Bonjour");
        System.out.println("Aurevoir");
        String prenom;
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Bonjour, quel est votre prenom ?");
        prenom = sc.nextLine();
        System.out.println("Votre prénom est " +prenom);
    }
    
}
