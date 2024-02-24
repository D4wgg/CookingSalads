package ru.liga.recipestep;

import ru.liga.salad.Salad;

public class DecorationSaladStep implements SaladCookingStep {
    @Override
    public void produce(Salad salad) {
        System.out.println("Украшаю салат");
    }
}
