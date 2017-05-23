package com.dojo.kata.Kebab;

/**
 * Created by Sachouw on 23/05/2017.
 */
public class Ingredient {

    private String nom;
    private boolean isViande;

    public Ingredient(String nom, boolean isViande) {
        this.nom = nom;
        this.isViande = isViande;
    }

    public boolean isViande() {
        return isViande;
    }

    public boolean isPoisson() {
        return false;
    }
}
