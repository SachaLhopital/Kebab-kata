package com.dojo.kata.Ingredients;

/**
 * Created by Sachouw on 23/05/2017.
 */
public class IngredientNormal extends Ingredient {

    public IngredientNormal(String nom) {
        super(nom);
    }

    @Override
    public boolean isVegetarien() {
        return true;
    }

    @Override
    public boolean isPescetarien() {
        return true;
    }

    @Override
    public boolean isDoublable() {
        return false;
    }
}
