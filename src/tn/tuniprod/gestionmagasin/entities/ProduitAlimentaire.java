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
public class ProduitAlimentaire {

    private static int nbrProduits = 0;
    private int id;
    private String libelle, marque;
    private float prix;

    public ProduitAlimentaire() {
        nbrProduits++;
    }

    public ProduitAlimentaire(int id, String libelle, String marque) {
        nbrProduits++;
        this.id = id;
        this.libelle = libelle;
        this.marque = marque;

    }

    public ProduitAlimentaire(int id, String lib, String marque, float prix) {
        nbrProduits++;
        this.id = id;
        this.libelle = lib;
        this.marque = marque;
        this.prix = prix;
    }

    public void afficher() {
        System.out.println("Produit :\n\tid=" + this.id + "\n\tlibelle= "
                + this.libelle + "\n\tmarque= " + this.marque
                + "\n\tprix= " + this.prix);
    }

    public String toString() {
        return "Produit :\n\tid=" + this.id + "\n\tlibelle= "
                + this.libelle + "\n\tmarque= " + this.marque
                + "\n\tprix= " + this.prix;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setPrix(float prix) {
        if (prix < 0) {
            this.prix = 0;
        } else {
            this.prix = prix;
        }
    }

    public int getId() {
        return this.id;
    }

    public String getLibelle() {
        return this.libelle;
    }

    public String getMarque() {
        return this.marque;
    }

    public float getPrix() {
        return this.prix;
    }

    public static int getNbrProduits() {
        return nbrProduits;
    }

    public boolean comparer(ProduitAlimentaire p) {
        return ((this.id == p.id)
                && (this.libelle.equals(p.libelle))
                && (this.prix == p.prix));
    }

    public static boolean comparer(ProduitAlimentaire p1, ProduitAlimentaire p2) {
        return ((p1.id == p2.id)
                && (p1.libelle.equals(p2.libelle))
                && (p1.prix == p2.prix));
    }

    public int determinerTypeProduit() {
        if (this instanceof ProduitFruit) {
            return 1;
        }
        if (this instanceof ProduitLegume) {
            return 2;
        }
        return 3;
    }
}
