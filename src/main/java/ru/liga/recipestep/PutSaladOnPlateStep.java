package ru.liga.recipestep;

import ru.liga.exception.BrokenPlateException;
import ru.liga.salad.Salad;

public class PutSaladOnPlateStep implements SaladCookingStep{

    private static final double RANDOM_INDEX = 0.5;
    @Override
    public void produce(Salad salad) {
        var rand = Math.random();
        try {
            System.out.println("Выкладываю блюдо на тарелку");
            if (rand > RANDOM_INDEX) {
                System.out.println("Тарелка разбилась(((");
                throw new BrokenPlateException();
            }
        } catch (BrokenPlateException ex) {
            System.out.println("Ничего страшного, наложу в другую тарелку...");
        }
    }
}
