package ru.liga.recipestep;

import ru.liga.salad.Salad;

public class ServingSaladStep implements SaladCookingStep {
    @Override
    public void produce(Salad salad) {
        System.out.println("Подаю заказ гостю");
    }
}
