package ru.liga.recipestep;

import ru.liga.salad.Salad;

public class OilSaladStep implements SaladCookingStep {
    @Override
    public void produce(Salad salad) {
        System.out.println("Заправляю салат");
    }
}
