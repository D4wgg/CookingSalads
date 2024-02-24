package ru.liga.recipestep;

import ru.liga.salad.Salad;

public class SaltSaladStep implements SaladCookingStep {

    @Override
    public void produce(Salad salad) {
        System.out.println("Добавляю соль в салат");
    }
}
