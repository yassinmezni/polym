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
public class Caissier extends Employe {

    private int numCaisse;

    public Caissier(int id, int nbrHeures, String nom, String adresse, int numCaisse) {
        super(id, nbrHeures, nom, adresse);
        this.numCaisse = numCaisse;
    }

    public String toString(){
        return super.toString()+"\n\test un caissier dans la caisse num "+this.numCaisse;
    }

    public float calculerSalaire() {
        int nbr_Heures = super.getNbrHeures();
        int heuresSupp;
        heuresSupp = ((heuresSupp = nbr_Heures - 180) > 0) ? heuresSupp : 0;
        return ((heuresSupp > 0) ? 180f * 5f + heuresSupp * 1.15f * 5f : nbr_Heures * 5f);

    }
}
