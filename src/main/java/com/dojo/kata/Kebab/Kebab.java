package com.dojo.kata.Kebab;

import com.dojo.kata.Ingredients.Ingredient;
import com.dojo.kata.Visitors.VisitorPescetarien;
import com.dojo.kata.Visitors.VisitorVegetarien;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Kebab Kata réalisé par Sacha LHOPITAL et Yoan LAFAYE DE MICHEAUX en pair programming
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
            ingredient.accept(new VisitorVegetarien());
            if(!ingredient.isVegetarien()) {
                return false;
            }
        }
        return true;
    }

    public boolean isPescetarien() {
        for(Ingredient ingredient : getIngredients()) {
            ingredient.accept(new VisitorPescetarien());
            if(!ingredient.isPescetarien()) {
                return false;
            }
        }
        return true;
    }

    public void doublerIngredient(Ingredient ingredient) {
        int size = ingredients.size();
        for(int i = 0 ; i < size; i++) {
            if(ingredients.get(i).equals(ingredient)) {
                ingredients.add(i+1, ingredients.get(i));
                i++;
                size++;
            }
        }
    }

    public int quantiteIngredient(Ingredient ingredient) {
        int count = 0;
        for(Ingredient ingredient1 : getIngredients()) {
            if(ingredient.equals(ingredient1)) {
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
