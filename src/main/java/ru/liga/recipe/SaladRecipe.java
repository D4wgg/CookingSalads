package ru.liga.recipe;

import ru.liga.recipestep.AddSauceStep;
import ru.liga.recipestep.MixSaladStep;
import ru.liga.recipestep.SaladCookingStep;
import ru.liga.recipestep.SaltSaladStep;

import java.util.List;

public interface SaladRecipe {
    default List<SaladCookingStep> getCookingSteps() {
        return List.of(
                new MixSaladStep(),
                new SaltSaladStep(),
                new AddSauceStep(),
                new MixSaladStep()
        );
    }
}
