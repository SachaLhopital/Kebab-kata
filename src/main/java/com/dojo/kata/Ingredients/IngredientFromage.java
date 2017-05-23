package com.dojo.kata.Ingredients;

/**
 * Created by Sachouw on 23/05/2017.
 */
public class IngredientFromage extends Ingredient {

    public IngredientFromage(String nom) {
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
        return true;
    }


}
