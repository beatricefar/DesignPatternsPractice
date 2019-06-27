package com.beatricefarias.decorator;

public class MangoIceCream extends BaseIceCream {

    MangoIceCream(ScoopCount count) {
        super(Ingredient.mangoIceCream(count), count, IceCreamType.MANGO);
    }

}
