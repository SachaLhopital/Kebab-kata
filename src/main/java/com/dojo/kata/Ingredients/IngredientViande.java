package com.dojo.kata.Ingredients;

/**
 * Created by Sachouw on 23/05/2017.
 */
public class IngredientViande extends Ingredient {

    public IngredientViande(String nom) {
        super(nom);
    }

    @Override
    public boolean isVegetarien() {
        return false;
    }

    @Override
    public boolean isPescetarien() {
        return false;
    }

    @Override
    public boolean isDoublable() {
        return false;
    }
}
