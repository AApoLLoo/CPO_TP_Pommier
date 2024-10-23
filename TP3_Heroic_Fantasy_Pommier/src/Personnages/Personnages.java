/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author pommi
 */
public abstract class Personnages  {
    String nom;
    int NiveauVie;
    public Personnages (String nom, int NiveauVie){
        this.nom=nom;
        this.NiveauVie=NiveauVie;
    }
    public int NiveauViePersonnage(){
        return NiveauVie;
    }
    public String NomPersonnage(){
        return nom;
    }
}
    