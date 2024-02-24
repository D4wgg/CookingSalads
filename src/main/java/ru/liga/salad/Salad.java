package ru.liga.salad;

import ru.liga.recipe.SaladRecipe;

import java.util.List;

public abstract class Salad {
    protected final SaladRecipe recipe;

    protected List<Dressing> dressings;
    protected String name;

    public Salad(SaladRecipe recipe, List<Dressing> dressings, String name) {
        this.recipe = recipe;
        this.dressings = dressings;
        this.name = name;
    }

    public List<Dressing> getDressings() {
        return dressings;
    }

    public String getName() {
        return name;
    }

    public SaladRecipe getRecipe() {
        return recipe;
    }
}
