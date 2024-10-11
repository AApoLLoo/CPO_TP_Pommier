/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_pommier_antoine;
/**
 * @Auteur Pommier Antoine
 * @Groupe TDC
 * @Role du programe
 * @Date 11/10/2024
 */
public class TP2_Bieres_Pommier_Antoine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvee des trolls",(float) 7.0,"Dubuisson");
        BouteilleBiere autreBiere = new BouteilleBiere("Leffe", (float) 6.6,"Abbaye de Leffe");
        BouteilleBiere autreBiere2 = new BouteilleBiere("1664", (float) 5.5,"Abbaye de Kronenbourg");
        BouteilleBiere autreBiere3 = new BouteilleBiere("Megademon", (float) 16,"Abbaye de Megademon");
        BouteilleBiere autreBiere4 = new BouteilleBiere("Desperados", (float) 5.9,"Abbaye du Mexique");
        uneBiere.lireEtiquette();
        autreBiere.lireEtiquette();
        autreBiere2.lireEtiquette();
        autreBiere3.lireEtiquette();
        autreBiere4.lireEtiquette();
        uneBiere.Decapsuler(false);
        autreBiere.Decapsuler(true);
        autreBiere2.Decapsuler(false);
        autreBiere3.Decapsuler(true);
        autreBiere4.Decapsuler(false);
        System.out.println(uneBiere);
        System.out.println(autreBiere);
        System.out.println(autreBiere2);
        System.out.println(autreBiere3);
        System.out.println(autreBiere4);
        
    }
    
}
