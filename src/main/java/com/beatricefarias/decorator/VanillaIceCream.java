package com.beatricefarias.decorator;

public class VanillaIceCream extends BaseIceCream {

    public VanillaIceCream(ScoopCount count) {
        super(Ingredient.vanillaIceCream(count), count, IceCreamType.VANILLA);
    }

}
