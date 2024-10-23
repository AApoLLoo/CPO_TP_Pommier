/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArmesPackage;
/**
 *
 * @author pommi
 */
public class Epee extends Armes{
    int finesse;
    public Epee(String nom,int niveau, int finesse){
        super (nom, niveau);
        if (finesse > 100){
            throw new IllegalArgumentException("La finesse de l'arme est supérieure à 100");
        }
        this.finesse = finesse;
    }
    public int FinesseArmes(){
        return finesse;
    }
            @Override
    public String toString(){
        return "L'arme s'apelle : "+nom+" et son niveau d'attaque est de : "+niveau+" et sa finesse est de "+finesse;
    }
}
