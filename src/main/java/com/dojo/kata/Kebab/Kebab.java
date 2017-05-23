package com.dojo.kata.Kebab;

import com.dojo.kata.Ingredients.Ingredient;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Sachouw on 23/05/2017.
 */
public class Kebab {

    private List<Ingredient> ingredients;

    public Kebab(Ingredient... ingredients) {
        this.ingredients = new LinkedList<>(Arrays.asList(ingredients));
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
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

    public void doublerFromage() {
        int size = ingredients.size();
        for(int i = 0 ; i < size; i++) {
            if(ingredients.get(i).isDoublable()) {
                ingredients.add(i+1, ingredients.get(i));
                i++;
                size++;
            }
        }
    }

    public int quantiteFromage() {
        int count = 0;
        for(Ingredient ingredient : getIngredients()) {
            if(ingredient.isDoublable()) {
                count++;
            }
        }
        return count;
    }

    public void remove(Ingredient ingredient) {
        List<Ingredient> ingredientsToRemove = new LinkedList<>();
        for(Ingredient ingredient1 : ingredients) {
            if(ingredient1.equals(ingredient)) {
                ingredientsToRemove.add(ingredient1);
            }
        }
        ingredients.removeAll(ingredientsToRemove);
    }
}
