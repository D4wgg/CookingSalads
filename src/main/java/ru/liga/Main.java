package ru.liga;

import ru.liga.chief.Chief;
import ru.liga.chief.MainChief;
import ru.liga.recipe.HerringSaladRecipe;
import ru.liga.recipe.OlivieSaladRecipe;
import ru.liga.recipe.VegetableSaladRecipe;
import ru.liga.salad.HerringSalad;
import ru.liga.salad.OlivieSalad;
import ru.liga.salad.Salad;
import ru.liga.salad.VegetableSalad;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Salad olivie = new OlivieSalad(new OlivieSaladRecipe());
        Salad vegetableSalad = new VegetableSalad(new VegetableSaladRecipe());
        Salad herringSalad = new HerringSalad(new HerringSaladRecipe());
        List<Salad> order = List.of(
                olivie,
                vegetableSalad,
                vegetableSalad,
                vegetableSalad,
                vegetableSalad,
                vegetableSalad,
                herringSalad
        );
        Chief chief = new MainChief();
        chief.cook(order);
    }
}
