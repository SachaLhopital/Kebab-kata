package com.dojo.kata.Kebab;

import com.dojo.kata.Ingredients.Ingredient;
import com.dojo.kata.Ingredients.IngredientNormal;
import com.dojo.kata.Ingredients.IngredientPoisson;
import com.dojo.kata.Ingredients.IngredientViande;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Sachouw on 23/05/2017.
 */
public class KebabTest {

    private Kebab kebabCarnivore;
    private Kebab kebabVegetarien;
    private Kebab kebabPoisson;

    private IngredientPoisson thon;
    private IngredientNormal sauceAlgerienne;
    private IngredientNormal tomate;
    private IngredientNormal oignon;
    private IngredientViande agneau;
    private IngredientNormal fromage;

    @Before
    public void setUp() {

        thon = new IngredientPoisson("poisson");
        sauceAlgerienne = new IngredientNormal("sauceAlgerienne");
        tomate = new IngredientNormal("tomate");
        oignon = new IngredientNormal("oignon");
        agneau = new IngredientViande("agneau");
        fromage = new IngredientNormal("fromage");

        kebabCarnivore = new Kebab(oignon, sauceAlgerienne, tomate, agneau);
        kebabVegetarien = new Kebab(sauceAlgerienne, tomate, oignon);
        kebabPoisson = new Kebab(thon, sauceAlgerienne, oignon, fromage);
    }

    @Test
    public void isVegetarien_devrait_retourner_vrai_pour_kebabVegetarien() {
        assertThat(kebabVegetarien.isVegetarien()).isTrue();
    }

    @Test
    public void isVegetarien_devrait_retourner_faux_pour_kebabCarnivore() {
        assertThat(kebabCarnivore.isVegetarien()).isFalse();
    }

    @Test
    public void isVegetarien_devrait_retourner_faux_pour_kebabPoisson() {
        assertThat(kebabPoisson.isVegetarien()).isFalse();
    }

    @Test
    public void isPescetarien_devrait_retourner_faux_pour_kebabCarnivore() {
        assertThat(kebabCarnivore.isPescetarien()).isFalse();
    }

    @Test
    public void isPescetarien_devrait_retourner_true_pour_kebabVegetarien() {
        assertThat(kebabVegetarien.isPescetarien()).isTrue();
    }

    @Test
    public void isPescetarien_devrait_retourner_true_pour_kebabPoisson() {
        assertThat(kebabPoisson.isPescetarien()).isTrue();
    }
}
