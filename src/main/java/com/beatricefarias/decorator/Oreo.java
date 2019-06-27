package com.beatricefarias.decorator;

import java.util.List;

import static com.beatricefarias.decorator.Prices.OREO;

public class Oreo implements IceCream {

    private final IceCream decorated;

    public Oreo(IceCream decorated) {
        this.decorated = decorated;
    }

    @Override
    public List<Ingredient> getIngredients() {
        List<Ingredient> ingredients = decorated.getIngredients();
        ingredients.add(Ingredient.oreo());
        return ingredients;
    }

    @Override
    public double getPrice() {
        return OREO.getPrice() + decorated.getPrice();
    }
}
