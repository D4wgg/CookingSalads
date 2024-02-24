package ru.liga.salad;

import ru.liga.recipe.SaladRecipe;

import java.util.List;

public class HerringSalad extends Salad {

    public static final List<Dressing> DRESSINGS = List.of(Dressing.MAYO);
    public static final String NAME = "Селедка под шубой";

    public HerringSalad(SaladRecipe recipe) {
        super(recipe, DRESSINGS, NAME);
    }
}
