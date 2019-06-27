package com.beatricefarias.decorator;

public class Ingredient {

    String description;

    private static final String SCOOPS = "scoops";
    private static final String WEIGHT = "g";
    private static final String VOLUME = "mL";

    static Ingredient vanillaIceCream(ScoopCount scoopCount) {
        return new Ingredient("Vanilla dream ice cream", scoopCount.getCount(), SCOOPS);
    }

    static Ingredient chocolateIceCream(ScoopCount scoopCount) {
        return new Ingredient("Chocolate sunshine ice cream", scoopCount.getCount(), SCOOPS);
    }

    static Ingredient mangoIceCream(ScoopCount scoopCount) {
        return new Ingredient("Mango siesta ice cream", scoopCount.getCount(), SCOOPS);
    }

    static Ingredient oreo() {
        return new Ingredient("Oreo sprinkles", 15, WEIGHT);
    }

    static Ingredient chocolateSyrup() {
        return new Ingredient("Chocolate syrup", 5, VOLUME);
    }

    static Ingredient strawberries() {
        return new Ingredient("Strawberies", 10, WEIGHT);
    }

    private Ingredient(
            String name,
            int quantity,
            String measurement
    ) {
        description = String.format("%d %s %s", quantity, measurement, name);
    }

    public String getDescription() {
        return description;
    }
}
