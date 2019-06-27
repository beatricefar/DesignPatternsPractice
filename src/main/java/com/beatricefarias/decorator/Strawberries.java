package com.beatricefarias.decorator;

import java.util.List;

import static com.beatricefarias.decorator.Prices.STRAWBERIES;

public class Strawberries implements IceCream {

    private final IceCream decorated;

    public Strawberries(IceCream decorated) {
        this.decorated = decorated;
    }

    @Override
    public List<Ingredient> getIngredients() {
        List<Ingredient> ingredients = decorated.getIngredients();
        ingredients.add(Ingredient.strawberries());
        return ingredients;
    }

    @Override
    public double getPrice() {
        return STRAWBERIES.getPrice() + decorated.getPrice();
    }

}
