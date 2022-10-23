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
public class Magasin {

    private int nbrProduits = 0;
    private int nbrEmployes = 0;
    private final int MAX_CAPACITE = 50;
    private int id, capacite;
    private String adresse, nom;
    private ProduitAlimentaire[] produits;
    private Employe[] employes;

    public Magasin(int id, int capacite, String adresse) {
        this.id = id;
        this.adresse = adresse;
        if (capacite <= MAX_CAPACITE) {
            this.capacite = capacite;
        } else {
            this.capacite = MAX_CAPACITE;
        }
        produits = new ProduitAlimentaire[capacite];
        employes = new Employe[20];
    }

    public Magasin(int id, int capacite, String adresse, String nom) {
        this.id = id;
        this.adresse = adresse;
        this.nom = nom;
        if (capacite <= MAX_CAPACITE) {
            this.capacite = capacite;
        } else {
            this.capacite = MAX_CAPACITE;
        }
        produits = new ProduitAlimentaire[capacite];
        employes = new Employe[20];
    }

    public boolean ajouterProduit(ProduitAlimentaire p) {
        if (chercherProduit(p)) {
            return false;
        }

        if (nbrProduits >= capacite) {
            return false;
        }
        determinerTypeProduit(p);
        produits[nbrProduits] = p;
        nbrProduits++;
        return true;
    }

    public String toString() {
        String resultat = "Magasin: \n\t id= " + this.id
                + "\n\t situé à " + this.adresse
                + "\n contient les produits: ";
        for (int i = 0; i < nbrProduits; i++) {
            resultat += "\n" + produits[i].toString();
        }

        return resultat;
    }

    public int getCapacite() {
        return this.capacite;
    }

    public boolean chercherProduit(ProduitAlimentaire p) {
        for (int i = 0; i < nbrProduits; i++) {
            if (produits[i].comparer(p)) {
                return true;
            }
        }
        return false;
    }

    public int chercherProduit2(ProduitAlimentaire p) {
        for (int i = 0; i < nbrProduits; i++) {
            if (produits[i].comparer(p)) {
                return i;
            }
        }
        return -1;
    }

    public boolean supprimerProduit(ProduitAlimentaire p) {
        int pos = chercherProduit2(p);
        if (pos == -1) {
            return false;
        }
        produits[pos] = produits[nbrProduits - 1];
        nbrProduits--;
        return true;
    }

    public boolean supprimerProduit2(ProduitAlimentaire p) {
        int pos = chercherProduit2(p);
        if (pos == -1) {
            return false;
        }

        for (int i = pos; i < nbrProduits - 1; i++) {
            produits[i] = produits[i + 1];
        }

        nbrProduits--;
        return true;
    }

    public Magasin comparerParNbr(Magasin m) {
        return (this.nbrProduits > m.nbrProduits) ? this : m;
    }

    public void ajouterEmploye(Employe e) {
        if (nbrEmployes == 20) {
            System.out.println("Tableau d'employés plein");
        } else {
            employes[nbrEmployes] = e;
            nbrEmployes++;
        }
    }

    public void determinerTypeProduit(ProduitAlimentaire p) {
        if (p instanceof ProduitFruit) {
            System.out.println("Ajout d'un produit fruit");
        } else if (p instanceof ProduitLegume) {
            System.out.println("Ajout d'un produit légume");
        } else {
            System.out.println("Produit alimentaire");
        }
    }

    public float calculStock(){
        float stock=0;
        for (int i = 0; i < nbrProduits; i++) {
            if(produits[i] instanceof ProduitFruit)
                //stock += ((ProduitAgricole)produits[i]).getQuantite();
                stock += ((ProduitFruit)produits[i]).getQuantite();
        }
        return stock;
    }
}
