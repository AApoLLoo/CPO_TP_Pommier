/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PersonnagesPackage;

/**
 *
 * @author pommi
 */
public class Magicien extends Personnages {
    boolean confirme;
    public Magicien(String nom, int NiveauVie, boolean confirme){
        super(nom,NiveauVie);
        this.confirme=confirme;
        nombresMagiciens++;
    }
    @Override
    public void finalize(){
        super.finalize();
        nombresMagiciens--;
    }
    public void attaquer(Personnages autre){
        int degats = ArmesMain.NiveauArmes(); 
        if (ArmesMain.getTypeArmes()) { 
        degats *= ArmesMain.AgeBaton(); 
    } 
    if (confirme) { degats /= 2; } autre.estAttaque(degats); 
    this.seFatiguer();
    System.out.println("Le magicien attaque "+autre.NomPersonnage()+" et inflige 20 points de degats !");
    }
    public boolean MagicienConfirme(){
        return confirme;
    }
     public void setConfirme(boolean confirme){
        this.confirme=confirme; 
    }
    @Override
    public String toString(){
        return "Le nom du personnage est : "+NomPersonnage()+" et son niveau de vie est de : "+NiveauViePersonnage()+" PV"+" et il est "+ (confirme ? "confirme" : "novice");
    }
}
