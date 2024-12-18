/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PersonnagesPackage;

/**
 *
 * @author pommi
 */
public class Guerrier extends Personnages {
    boolean cheval;
    public Guerrier(String nom, int NiveauVie, boolean cheval){
        super(nom,NiveauVie);
        this.cheval=cheval;
        nombresGuerriers++;
    }
    @Override
    public void finalize(){
        super.finalize();
        nombresGuerriers--;
    }
    public boolean GuerrierCheval(){
        return cheval;
    }
    public void setCheval(boolean cheval){
        this.cheval=cheval; 
    }
    @Override
    public String toString(){
        return "Le nom du personnage est : "+NomPersonnage()+" et son niveau de vie est de : "+NiveauViePersonnage()+" PV"+ " et il est "+ (cheval ? "a cheval" : "a pied");
    }
}
