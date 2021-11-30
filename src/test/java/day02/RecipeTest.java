package day02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecipeTest {


    @Test
    void testCreateFromName() {
        Recipe recipe = new Recipe("recept");

        assertEquals("recept", recipe.getName());
        assertEquals(0, recipe.getIngredients().size());
        assertEquals(null, recipe.getDescription());
    }

    @Test
    void testCreateNameAndDesription() {
        Recipe recipe = new Recipe("recept2", "leírás");


        assertEquals("recept2", recipe.getName());
        assertEquals(0, recipe.getIngredients().size());
        assertEquals("leírás", recipe.getDescription());
    }

    @Test
    void addIngredientTestOne() {
        Recipe recipe = new Recipe("recept3", "leírás");
        recipe.addIngredient("hozzávaló1");

        assertEquals(1, recipe.getIngredients().size());
        assertEquals("hozzávaló1", recipe.getIngredients().get(0));
    }

    @Test
    void addIngredientTestMore() {
        Recipe recipe = new Recipe("recept3", "leírás");
        recipe.addIngredient("hozzávaló1", "hozzávaló2", "hozzávaló3");

        assertEquals(3, recipe.getIngredients().size());
        assertEquals("hozzávaló1", recipe.getIngredients().get(0));
        assertEquals("hozzávaló2", recipe.getIngredients().get(1));
        assertEquals("hozzávaló3", recipe.getIngredients().get(2));
    }
}