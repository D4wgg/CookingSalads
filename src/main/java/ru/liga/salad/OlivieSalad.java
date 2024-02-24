package ru.liga.salad;

import ru.liga.recipe.SaladRecipe;

import java.util.List;

public class OlivieSalad extends Salad {
    public static final List<Dressing> DRESSINGS = List.of(Dressing.MAYO);
    public static final String NAME = "Оливье";

    public OlivieSalad(SaladRecipe recipe) {
        super(recipe, DRESSINGS, NAME);
    }
}
