package com.dojo.kata.Ingredients;

/**
 * Created by Sachouw on 23/05/2017.
 */
public class IngredientPoisson extends Ingredient {

    public IngredientPoisson(String nom) {
        super(nom);
    }

    @Override
    public boolean isVegetarien() {
        return false;
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
