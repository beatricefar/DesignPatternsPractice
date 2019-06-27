package com.beatricefarias.decorator;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseIceCream implements IceCream{

    private List<Ingredient> ingredients;
    private double price;


    BaseIceCream(Ingredient ingredient, ScoopCount count, IceCreamType priceCoefficient) {
        ingredients = new ArrayList<>(1);
        ingredients.add(ingredient);
        price = priceCoefficient.priceCoefficientWithScoopCount(count);
    }

    @Override
    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    @Override
    public double getPrice() {
        return price;
    }

}
