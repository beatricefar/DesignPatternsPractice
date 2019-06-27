package com.beatricefarias.decorator;

public enum IceCreamType {
    VANILLA(1),
    CHOCOLATE(1.1),
    MANGO(1.2);

    double priceCoefficient;

    IceCreamType(double priceCoefficient) {
        this.priceCoefficient = priceCoefficient;
    }

    double priceCoefficientWithScoopCount(ScoopCount scoopCount) {
        return priceCoefficient * scoopCount.getPrice();
    }
}
