package com.beatricefarias.decorator;

import java.util.List;

import static com.beatricefarias.decorator.Prices.CHOCOLATE_SYRUP;

public class ChocolateSyrup implements IceCream {

    private final IceCream decorated;

    ChocolateSyrup(IceCream decorated) {
        this.decorated = decorated;
    }

    @Override
    public List<Ingredient> getIngredients() {
        List<Ingredient> ingredients = decorated.getIngredients();
        ingredients.add(Ingredient.chocolateSyrup());
        return ingredients;
    }

    @Override
    public double getPrice() {
        return CHOCOLATE_SYRUP.getPrice() + decorated.getPrice();
    }

}
