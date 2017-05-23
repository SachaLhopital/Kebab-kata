package com.dojo.kata.Ingredients;

import com.dojo.kata.Visitors.Visitor;

/**
 * Created by Sachouw on 23/05/2017.
 */
public class IngredientFromage extends Ingredient {

    public IngredientFromage(String nom) {
        super(nom);
    }

    @Override
    public boolean isVegetarien() {
        return visiteur.visit(this);
    }

    @Override
    public boolean isPescetarien() {
        return visiteur.visit(this);
    }
}
