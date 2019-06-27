package com.beatricefarias.decorator;

public class ChocolateIceCream extends BaseIceCream {

    ChocolateIceCream(ScoopCount count) {
        super(Ingredient.chocolateIceCream(count), count, IceCreamType.CHOCOLATE);
    }

}
