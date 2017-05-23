package com.dojo.kata.Kebab;

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

    private Ingredient thon;
    private Ingredient pommeDeTerre;
    private Ingredient tomate;
    private Ingredient oignon;
    private Ingredient agneau;
    private Ingredient fromage;

    @Before
    public void setUp() {

        thon = new IngredientPoisson("poisson");
        pommeDeTerre = new Ingredient("pommeDeTerre", false);
        tomate = new Ingredient("tomate", false);
        oignon = new Ingredient("oignon", false);
        agneau = new Ingredient("agneau", true);
        fromage = new Ingredient("fromage", false);

        kebabCarnivore = new Kebab(oignon, pommeDeTerre, tomate, agneau);
        kebabVegetarien = new Kebab(pommeDeTerre, tomate, oignon);
        kebabPoisson = new Kebab(thon, pommeDeTerre, oignon, fromage);
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
