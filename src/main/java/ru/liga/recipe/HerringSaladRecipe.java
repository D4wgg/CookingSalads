package ru.liga.recipe;

import ru.liga.recipestep.AddSauceStep;
import ru.liga.recipestep.MixSaladStep;
import ru.liga.recipestep.PutSaladLayerStep;
import ru.liga.recipestep.PutSaladOnPlateStep;
import ru.liga.recipestep.SaladCookingStep;
import ru.liga.recipestep.ServingSaladStep;

import java.util.List;

public class HerringSaladRecipe implements SaladRecipe {
    @Override
    public List<SaladCookingStep> getCookingSteps() {
        return List.of(
                new PutSaladLayerStep(),
                new MixSaladStep(),
                new PutSaladLayerStep(),
                new AddSauceStep(),
                new MixSaladStep(),
                new PutSaladLayerStep(),
                new PutSaladOnPlateStep(),
                new ServingSaladStep()
        );
    }
}
