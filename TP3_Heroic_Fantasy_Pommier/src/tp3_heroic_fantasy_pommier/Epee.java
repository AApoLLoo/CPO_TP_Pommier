/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_pommier;
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
}
