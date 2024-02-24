package ru.liga.recipe;

import ru.liga.recipestep.AddSauceStep;
import ru.liga.recipestep.DecorationSaladStep;
import ru.liga.recipestep.MixSaladStep;
import ru.liga.recipestep.PreparingStep;
import ru.liga.recipestep.PutSaladOnPlateStep;
import ru.liga.recipestep.SaladCookingStep;
import ru.liga.recipestep.SaltSaladStep;
import ru.liga.recipestep.ServingSaladStep;
import ru.liga.vegetable.Cucumber;
import ru.liga.vegetable.CutForm;
import ru.liga.vegetable.Onion;
import ru.liga.vegetable.Tomato;

import java.util.List;

public class VegetableSaladRecipe implements SaladRecipe {
    @Override
    public List<SaladCookingStep> getCookingSteps() {
        return List.of(
                new PreparingStep(List.of(new Tomato(CutForm.SLICE), new Cucumber(CutForm.CUBE), new Onion(CutForm.RING))),
                new SaltSaladStep(),
                new MixSaladStep(),
                new AddSauceStep(),
                new DecorationSaladStep(),
                new PutSaladOnPlateStep(),
                new ServingSaladStep()
        );
    }
}
