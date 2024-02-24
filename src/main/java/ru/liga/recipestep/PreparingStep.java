package ru.liga.recipestep;

import ru.liga.salad.Salad;
import ru.liga.vegetable.Vegetable;

import java.util.List;

public class PreparingStep implements SaladCookingStep {

    private final List<Vegetable> vegetables;

    public PreparingStep(List<Vegetable> vegetables) {
        this.vegetables = vegetables;
    }

    @Override
    public void produce(Salad salad) {
        vegetables.forEach(vegetable ->
                System.out.printf("%s : %s%n", vegetable.getName(), vegetable.getCutForm().getCutting())
        );
    }
}
