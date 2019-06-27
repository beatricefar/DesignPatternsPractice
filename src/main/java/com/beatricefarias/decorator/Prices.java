package com.beatricefarias.decorator;

public enum Prices {
    OREO(0.6),
    CHOCOLATE_SYRUP(0.3),
    STRAWBERIES(1);

    private double price;

    Prices(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

}
