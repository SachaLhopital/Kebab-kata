package com.dojo.kata.Visitors;

import com.dojo.kata.Ingredients.*;

/**
 * Created by Sachouw on 23/05/2017.
 */
public abstract class Visitor {

    public abstract boolean visit(Ingredient i);

    public abstract boolean visit(IngredientFromage i);

    public abstract boolean visit(IngredientPoisson i);

    public abstract boolean visit(IngredientViande i);
}
