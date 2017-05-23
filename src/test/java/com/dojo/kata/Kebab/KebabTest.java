package com.dojo.kata.Kebab;

import com.dojo.kata.Ingredients.*;
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
    private Ingredient sauceAlgerienne;
    private Ingredient tomate;
    private Ingredient oignon;
    private Ingredient agneau;
    private Ingredient fromage;

    @Before
    public void setUp() {

        sauceAlgerienne = new Ingredient("sauceAlgerienne");
        tomate = new Ingredient("tomate");
        oignon = new Ingredient("oignon");
        thon = new IngredientPoisson("poisson");
        agneau = new IngredientViande("agneau");
        fromage = new IngredientFromage("fromage");

        kebabCarnivore = new Kebab(oignon, sauceAlgerienne, tomate, agneau);
        kebabVegetarien = new Kebab(sauceAlgerienne, tomate, oignon, fromage);
        kebabPoisson = new Kebab(thon, sauceAlgerienne, fromage, oignon, fromage, oignon);
    }

    //Vegetarien

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

    //Pescetarien

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

    //Doubler le fromage

    @Test
    public void doublerIngredient_devrait_ne_rien_faire_si_ne_contient_pas_lingredient() {
        assertThat(kebabCarnivore.quantiteIngredient(fromage)).isEqualTo(0);
        kebabCarnivore.doublerIngredient(fromage);
        assertThat(kebabCarnivore.quantiteIngredient(fromage)).isEqualTo(0);
    }

    @Test
    public void doublerIngredient_devrait_doubler_toutes_portions_ingredient() {
        assertThat(kebabVegetarien.quantiteIngredient(fromage)).isEqualTo(1);
        kebabVegetarien.doublerIngredient(fromage);
        assertThat(kebabVegetarien.quantiteIngredient(fromage)).isEqualTo(2);

        assertThat(kebabPoisson.quantiteIngredient(fromage)).isEqualTo(2);
        kebabPoisson.doublerIngredient(fromage);
        assertThat(kebabPoisson.quantiteIngredient(fromage)).isEqualTo(4);
    }

    //Enlever des oignons

    @Test
    public void remove_devrait_supprimer_ingredient() {
        assertThat(kebabVegetarien.getIngredients().size()).isEqualTo(4);
        kebabVegetarien.remove(oignon);
        assertThat(kebabVegetarien.getIngredients().size()).isEqualTo(3);

        assertThat(kebabPoisson.getIngredients().size()).isEqualTo(6);
        kebabPoisson.remove(oignon);
        assertThat(kebabPoisson.getIngredients().size()).isEqualTo(4);
    }
}
