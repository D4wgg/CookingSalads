package ru.liga.recipestep;

import ru.liga.salad.Dressing;
import ru.liga.salad.Salad;

import java.util.stream.Collectors;

public class AddSauceStep implements SaladCookingStep {
    @Override
    public void produce(Salad salad) {
        System.out.println("Заправляю салат с помощью " +
                salad.getDressings().stream().map(Dressing::getLabel).collect(Collectors.joining(","))
        );
    }
}
