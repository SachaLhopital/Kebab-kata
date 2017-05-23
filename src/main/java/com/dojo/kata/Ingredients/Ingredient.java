package com.dojo.kata.Ingredients;

/**
 * Created by Sachouw on 23/05/2017.
 */
public abstract class Ingredient {

    private String nom;

    public Ingredient(String nom) {
        this.nom = nom;
    }

    public abstract boolean isVegetarien();
    public abstract boolean isPescetarien();
    public abstract boolean isDoublable();
}
