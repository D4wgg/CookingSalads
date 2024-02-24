package ru.liga.chief;

import ru.liga.salad.Salad;

import java.util.List;

public class MainChief implements Chief {

    @Override
    public void cook(List<Salad> orderedSalads) {
        orderedSalads.forEach(salad -> {
            System.out.println("Приступаю к готовке " + salad.getName());
            salad.getRecipe().getCookingSteps().forEach(step -> step.produce(salad));
            System.out.println("__________________________________________");
        });
    }
}
