package ru.liga.salad;

import ru.liga.recipe.SaladRecipe;

import java.util.List;

public class VegetableSalad extends Salad {
    public static final List<Dressing> DRESSINGS = List.of(Dressing.OIL);
    public static final String NAME = "Овощной салат";

    public VegetableSalad(SaladRecipe recipe) {
        super(recipe, DRESSINGS, NAME);
    }
}
