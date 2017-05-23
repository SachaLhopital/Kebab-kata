package com.dojo.kata.Visitors;

import com.dojo.kata.Ingredients.*;

/**
 * Created by Sachouw on 23/05/2017.
 */
public class VisitorVegetarien extends Visitor {

    public boolean visit(Ingredient i) {
        return true;
    }

    public boolean visit(IngredientFromage i) {
        return true;
    }

    public boolean visit(IngredientPoisson i) {
        return false;
    }

    public boolean visit(IngredientViande i) {
        return false;
    }
}
