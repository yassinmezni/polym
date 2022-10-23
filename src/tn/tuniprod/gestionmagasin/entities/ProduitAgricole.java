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
public abstract class ProduitAgricole extends ProduitAlimentaire {

    public static String[] saisons = new String[]{
        "Janvier", "Fevrier", "Mars",
         "Avril", "Mai", "Juin",
         "Juillet", "Aout", "Septembre",
         "Octobre", "Novembre", "Décembre"};

    private int saison;
    private float quantite;

    public ProduitAgricole() {

    }

    public ProduitAgricole(int saison, float quantite, int id, String libelle, String marque) {
        super(id, libelle, marque);
        this.saison = saison;
        this.quantite = quantite;
    }

    public int getSaison() {
        return this.saison;
    }

    public void setSaison(int saison) {
        this.saison = saison;
    }

    public float getQuantite() {
        return quantite;
    }

    public void setQuantite(float quantite) {
        this.quantite = quantite;
    }
}
