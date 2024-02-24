package ru.liga.recipestep;

import ru.liga.salad.Salad;

public class PutSaladLayerStep implements SaladCookingStep {

    @Override
    public void produce(Salad salad) {
        System.out.println("Выкладываю все ингредиенты слоя");
    }
}
