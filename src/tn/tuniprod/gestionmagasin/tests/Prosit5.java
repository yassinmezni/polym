/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.tuniprod.gestionmagasin.tests;

import tn.tuniprod.gestionmagasin.entities.Magasin;
import tn.tuniprod.gestionmagasin.entities.ProduitAgricole;
import tn.tuniprod.gestionmagasin.entities.ProduitAlimentaire;
import tn.tuniprod.gestionmagasin.entities.ProduitFruit;
import tn.tuniprod.gestionmagasin.entities.ProduitLegume;

/**
 *
 * @author bhk
 */
public class Prosit5 {
    public static void main(String[] args) {
        ProduitAlimentaire p1 = new ProduitFruit(3, 12.3f, 1254, "Fraise", "marque1");
        ProduitAgricole p2 = new ProduitFruit(6, 50, 1224, "Pastèque", "marque2");
        ProduitFruit p3 = new ProduitFruit(12, 25.6f, 7896, "Mandarine", "marque2");
        
        ProduitLegume p4 = new ProduitLegume(1, 14, 8521, "Artichaut", "marque légumes");
        
        Magasin m = new Magasin(1, 20, "Tunis");
        m.ajouterProduit(p1);
        m.ajouterProduit(p2);
        m.ajouterProduit(p3);
        m.ajouterProduit(p4);
        
        System.out.println(m);
        System.out.println("stock fruits m "+ m.calculStock());

        System.out.println("Est frais pour p1 "+((ProduitFruit)p1).estFrais("Mars"));
        System.out.println("Est frais pour p2 "+((ProduitFruit)p2).estFrais("Mars"));
        System.out.println("Est frais pour p3 "+p3.estFrais("Décembre"));
        System.out.println("Est frais pour p4 "+p4.estFrais("Fevrier"));
        
    }
}
