/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.tuniprod.gestionmagasin.entities;

import tn.tuniprod.gestionmagasin.interfaces.Critere;

/**
 *
 * @author bhk
 */
public class ProduitFruit extends ProduitAgricole
        implements Critere {

    public ProduitFruit() {
    }

    public ProduitFruit(int saison, float quantite, int id, String libelle, String marque) {
        super(saison, quantite, id, libelle, marque);
    }

    public boolean estFrais(String saison) {
        int i = super.getSaison();
        if (ProduitAgricole.saisons[i - 1].equals(saison)) {
            return true;
        }
        return false;
    }
}
