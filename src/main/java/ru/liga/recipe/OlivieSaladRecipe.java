package ru.liga.recipe;

import ru.liga.recipestep.AddSauceStep;
import ru.liga.recipestep.DecorationSaladStep;
import ru.liga.recipestep.MixSaladStep;
import ru.liga.recipestep.PutSaladOnPlateStep;
import ru.liga.recipestep.SaladCookingStep;
import ru.liga.recipestep.SaltSaladStep;
import ru.liga.recipestep.ServingSaladStep;

import java.util.List;

public class OlivieSaladRecipe implements SaladRecipe {
    @Override
    public List<SaladCookingStep> getCookingSteps() {
        return List.of(
                new MixSaladStep(),
                new SaltSaladStep(),
                new MixSaladStep(),
                new AddSauceStep(),
                new DecorationSaladStep(),
                new PutSaladOnPlateStep(),
                new ServingSaladStep()
        );
    }
}
