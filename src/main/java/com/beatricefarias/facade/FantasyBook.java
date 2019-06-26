package com.beatricefarias.facade;

public class FantasyBook implements Book{

    @Override
    public String getName() {
        return "The Way of Kings";
    }

    @Override
    public BookGenre getGenre() {
        return BookGenre.FANTASY;
    }

    @Override
    public double getBookPrice() {
        return 9.47;
    }

}
