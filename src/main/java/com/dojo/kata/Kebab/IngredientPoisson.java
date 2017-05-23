package com.dojo.kata.Kebab;

/**
 * Created by Sachouw on 23/05/2017.
 */
public class IngredientPoisson extends Ingredient {

    public IngredientPoisson(String nom) {
        super(nom, false);
    }

    @Override
    public boolean isPoisson() {
        return true;
    }
}
