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

    private IngredientPoisson thon;
    private IngredientNormal sauceAlgerienne;
    private IngredientNormal tomate;
    private IngredientNormal oignon;
    private IngredientViande agneau;
    private IngredientFromage fromage;
    private IngredientFromage compte;

    @Before
    public void setUp() {

        thon = new IngredientPoisson("poisson");
        sauceAlgerienne = new IngredientNormal("sauceAlgerienne");
        tomate = new IngredientNormal("tomate");
        oignon = new IngredientNormal("oignon");
        agneau = new IngredientViande("agneau");
        fromage = new IngredientFromage("fromage");
        compte = new IngredientFromage("compté");

        kebabCarnivore = new Kebab(oignon, sauceAlgerienne, tomate, agneau);
        kebabVegetarien = new Kebab(sauceAlgerienne, tomate, oignon, fromage);
        kebabPoisson = new Kebab(thon, sauceAlgerienne, fromage, oignon, compte);
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
    public void doublerFromage_devrait_ne_rien_faire_si_pas_fromage() {
        assertThat(kebabCarnivore.quantiteFromage()).isEqualTo(0);
        kebabCarnivore.doublerFromage();
        assertThat(kebabCarnivore.quantiteFromage()).isEqualTo(0);
    }

    @Test
    public void doublerFromage_devrait_doubler_toutes_portions_fromage() {
        assertThat(kebabVegetarien.quantiteFromage()).isEqualTo(1);
        kebabVegetarien.doublerFromage();
        assertThat(kebabVegetarien.quantiteFromage()).isEqualTo(2);

        assertThat(kebabPoisson.quantiteFromage()).isEqualTo(2);
        kebabPoisson.doublerFromage();
        assertThat(kebabPoisson.quantiteFromage()).isEqualTo(4);
    }

    //Enlever des oignons
    @Test
    public void doublerFromage_devrait_ne_rien_faire_si_pas_fromage() {
        assertThat(kebabCarnivore.quantiteFromage()).isEqualTo(0);
        kebabCarnivore.doublerFromage();
        assertThat(kebabCarnivore.quantiteFromage()).isEqualTo(0);
    }

    @Test
    public void doublerFromage_devrait_doubler_toutes_portions_fromage() {
        assertThat(kebabVegetarien.quantiteFromage()).isEqualTo(1);
        kebabVegetarien.doublerFromage();
        assertThat(kebabVegetarien.quantiteFromage()).isEqualTo(2);

        assertThat(kebabPoisson.quantiteFromage()).isEqualTo(2);
        kebabPoisson.doublerFromage();
        assertThat(kebabPoisson.quantiteFromage()).isEqualTo(4);
    }


}
