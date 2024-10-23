/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArmesPackage;
/**
 *
 * @author pommi
 */
public class Baton extends Armes {
    int age;
    public Baton(String nom, int niveau, int age){
        super(nom, niveau);
        if (age >100){
            throw new IllegalArgumentException("L'age de l'arme est supérieur à 100");
        }
        this.age = age;
    }
    public int AgeBaton(){
        return age;
    }
    @Override
    public String toString(){
        return "L'arme s'apelle : "+nom+" et son niveau d'attaque est de : "+niveau+" et son age est de "+age +"ans";
    }
}
