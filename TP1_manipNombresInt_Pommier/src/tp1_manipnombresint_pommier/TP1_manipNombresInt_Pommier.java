/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_pommier;
import java.util.Scanner;
/**
 * @Auteur  Pommier Antoine
 * @Groupe  TDC
 * @Role du programe Apprendre la syntaxe de base de JAVA
 * @Date 23/09/2024
 */
public class TP1_manipNombresInt_Pommier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Saisie1;
        System.out.println("Entrez un entier ci-dessous : ");
        Saisie1 = sc.nextInt();
        int Saisie2;
        System.out.println("Entrez un deuxieme entier ci-dessous : ");
        Saisie2 = sc.nextInt();
        System.out.println("La saisie 1 est : " +Saisie1+ " et la saisie 2 est : " +Saisie2);
        int somme;
        int difference;
        int produit;
        somme = Saisie1+Saisie2;
        difference = Saisie1-Saisie2;
        produit = Saisie1*Saisie2;
        float quotient;
        quotient = (float) ((Saisie1)/Saisie2);
        int reste;
        reste = Saisie1%Saisie2;
        System.out.println("La somme de ces nombres : " + somme + " la difference est : "+difference+ " le produit est : "+produit+ "\n Le quotient est : " +quotient+ " et le reste est : " +reste);
    }
    
}
