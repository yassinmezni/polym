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
public class Responsable extends Employe{
    private int prime;
    
    public Responsable (int id, int nbrHeures, String nom, String adresse,int prime){
        super(id, nbrHeures, nom, adresse);
        this.prime=prime;
    }

    public String toString(){
        return super.toString()+"\n\test un responsable sa prime ="+this.prime;
    }

    public float calculerSalaire() {
        int nbr_Heures = super.getNbrHeures();
        int heuresSupp;
        heuresSupp = ((heuresSupp = nbr_Heures - 160) > 0) ? heuresSupp : 0;
        return ((heuresSupp > 0) ? (160f * 10f + heuresSupp * 1.2f * 10f )+ this.prime: nbr_Heures * 10f + this.prime);
    }
}
