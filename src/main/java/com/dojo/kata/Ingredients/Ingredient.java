package com.dojo.kata.Ingredients;

import com.dojo.kata.Visitors.Visitor;

/**
 * Created by Sachouw on 23/05/2017.
 */
public class Ingredient {

    private String nom;
    protected Visitor visiteur;

    public Ingredient(String nom) {
        this.nom = nom;
    }

    public boolean isVegetarien() {
        return visiteur.visit(this);
    }

    public boolean isPescetarien() {
        return visiteur.visit(this);
    }

    public void accept(Visitor visitor) {
        visiteur = visitor;
    }
}
