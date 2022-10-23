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
public abstract class Employe {

    private int id, nbrHeures;
    private String nom, adresse;

    public Employe(int id, int nbrHeures, String nom, String adresse) {
        this.id = id;
        this.nbrHeures = nbrHeures;
        this.nom = nom;
        this.adresse = adresse;
    }

    public Employe() {
    }

    
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNbrHeures() {
        return nbrHeures;
    }

    public void setNbrHeures(int nbrHeures) {
        this.nbrHeures = nbrHeures;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    
    public String toString(){
        return "Employe: \n\tid="+this.id+"\n\tnom="+this.nom;
    }
    
    public abstract float calculerSalaire();

}
