package com.dojo.kata.Kebab;

import com.dojo.kata.Ingredients.Ingredient;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Sachouw on 23/05/2017.
 */
public class Kebab {

    private List<Ingredient> ingredients;

    public Kebab(Ingredient... ingredients) {
        this.ingredients = new ArrayList<>(Arrays.asList(ingredients));
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public boolean isVegetarien() {
        for(Ingredient ingredient : getIngredients()) {
            if(!ingredient.isVegetarien()) {
                return false;
            }
        }
        return true;
    }

    public boolean isPescetarien() {
        for(Ingredient ingredient : getIngredients()) {
            if(!ingredient.isPescetarien()) {
                return false;
            }
        }
        return true;
    }
}
