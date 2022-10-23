/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.tuniprod.gestionmagasin.entities;

/**
 *
 * @author bhk
 */
public class Vendeur extends Employe {

    private float tauxDeVente;

    public Vendeur(int id, int nbrHeures, String nom, String adresse, float tauxDeVente) {
        super(id, nbrHeures, nom, adresse);
        this.tauxDeVente = tauxDeVente;
    }
    
    public String toString(){
        return super.toString()+"\n\test un vendeur ayant un taux de vente de "+this.tauxDeVente;
    }

    public float calculerSalaire() {
         return 450 * tauxDeVente;
    }

}
