package ru.liga.recipestep;

import ru.liga.salad.Salad;

public class MixSaladStep implements SaladCookingStep {
    @Override
    public void produce(Salad salad) {
        System.out.println("Перемещиваю салат");
    }
}
