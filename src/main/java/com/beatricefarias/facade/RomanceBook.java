package com.beatricefarias.facade;

public class RomanceBook implements Book {

    @Override
    public String getName() {
        return "Gone With The Wind";
    }

    @Override
    public BookGenre getGenre() {
        return BookGenre.ROMANCE;
    }

    @Override
    public double getBookPrice() {
        return 25.50;
    }

}
