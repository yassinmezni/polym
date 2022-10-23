/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.tuniprod.gestionmagasin.tests;

import tn.tuniprod.gestionmagasin.entities.Magasin;
import tn.tuniprod.gestionmagasin.entities.ProduitAlimentaire;

/**
 *
 * @author bhk
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Nbr Produits =" + ProduitAlimentaire.getNbrProduits());

        ProduitAlimentaire p0 = new ProduitAlimentaire();
        ProduitAlimentaire p1 = new ProduitAlimentaire(1021, "Lait", "Delice");
        ProduitAlimentaire p2 = new ProduitAlimentaire(2510, "Yaourt", "Vitalit");
        ProduitAlimentaire p3 = new ProduitAlimentaire(3250, "Tomate", "Sicam", 1.2f);

        p0.afficher();
        p1.afficher();
        p2.afficher();
        p3.afficher();
        System.out.println("************************* Après Modif *************************");
        p1.setPrix(0.7f);
        p1.afficher();
        p2.setPrix(0.5f);
        p2.afficher();
        System.out.println("************************* toString() *************************");

        System.out.println(p2);

        Magasin m1 = new Magasin(1, 25, "Ariana");
        System.out.println(m1.getCapacite());
        System.out.println("************************* Magasin *************************");

        m1.ajouterProduit(p1);
        m1.ajouterProduit(p2);
        m1.ajouterProduit(p3);
        System.out.println(m1);

        System.out.println("Nbr ProduitsP1 =" + p1.getNbrProduits());
        System.out.println("Nbr ProduitsP2 =" + p2.getNbrProduits());

        System.out.println("************************* Comparer *************************");
        System.out.println(p1.comparer(p2));
        System.out.println(p1.comparer(p1));
        System.out.println(ProduitAlimentaire.comparer(p2,p3));
        System.out.println(ProduitAlimentaire.comparer(p2,p2));
        
        
        
    }

}
