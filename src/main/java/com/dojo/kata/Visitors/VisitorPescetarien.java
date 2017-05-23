package com.dojo.kata.Visitors;

import com.dojo.kata.Ingredients.*;

/**
 * Created by Sachouw on 23/05/2017.
 */
public class VisitorPescetarien extends Visitor {

    @Override
    public boolean visit(Ingredient i) {
        return true;
    }

    @Override
    public boolean visit(IngredientFromage i) {
        return true;
    }

    @Override
    public boolean visit(IngredientPoisson i) {
        return true;
    }

    @Override
    public boolean visit(IngredientViande i) {
        return false;
    }
}
