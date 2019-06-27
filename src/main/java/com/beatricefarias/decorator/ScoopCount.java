package com.beatricefarias.decorator;

public enum ScoopCount {
    ONE(1),
    TWO(1.8),
    THREE(2.5);

    private double price;

    ScoopCount(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public int getCount() {
        int count = 0;
        switch (this) {
            case ONE:
                count = 1;
                break;
            case TWO:
                count = 2;
                break;
            case THREE:
                count = 3;
                break;
        }
        return count;
    }
}
