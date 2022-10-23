/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.tuniprod.gestionmagasin.tests;

import tn.tuniprod.gestionmagasin.entities.Caissier;
import tn.tuniprod.gestionmagasin.entities.Magasin;
import tn.tuniprod.gestionmagasin.entities.Responsable;
import tn.tuniprod.gestionmagasin.entities.Vendeur;

/**
 *
 * @author bhk
 */
public class MainProsit4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Magasin m1 = new Magasin(1,26, "Carrefour", "Centre-ville");
        Magasin m2 = new Magasin(2,30, "Monoprix", "Menzah6");
        
        Caissier c1=new Caissier(1, 60, "Caissier1", "Adresse1", 1);
        Caissier c2=new Caissier(2, 95, "Caissier2", "Adresse2", 2);
        Vendeur v1 = new Vendeur(1, 58, "Vendeur1", "Adresse Vendeur1", 1.2f);
        Responsable r1 = new Responsable(1, 102, "Responsable1", "Adresse resp1", 200);
        
        m1.ajouterEmploye(c1);
        m1.ajouterEmploye(c2);
        m1.ajouterEmploye(v1);
        m1.ajouterEmploye(r1);
        
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(v1);
        System.out.println(r1);
        
    }
    
}
