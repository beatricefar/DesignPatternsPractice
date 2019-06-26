package com.beatricefarias.facade;

public class ScienceFictionBook implements Book {

    @Override
    public String getName() {
        return "Hitchhiker's Guide to The Galaxy";
    }

    @Override
    public BookGenre getGenre() {
        return BookGenre.SCIENCE_FICTION;
    }

    @Override
    public double getBookPrice() {
        return 35.555;
    }

}
