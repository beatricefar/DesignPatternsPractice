package com.beatricefarias.facade;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class BooksCalculationImpl implements BooksCalculation {

    private List<Book> books = new ArrayList<>();

    public BooksCalculationImpl(
            FantasyBook fantasyBook,
            RomanceBook romanceBook,
            ScienceFictionBook scienceFictionBook
    ) {
        books.add(fantasyBook);
        books.add(romanceBook);
        books.add(scienceFictionBook);
    }

    @Override
    public double getTotalPrice() {
        double totalPrice = 0.0;
        for (Book book : books) {
            totalPrice += book.getBookPrice();
        }
        BigDecimal booksPrice = new BigDecimal(totalPrice);

        return booksPrice.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    @Override
    public int getBookCount() {

        int bookCount = 0;
        for (Book book : books) {
            bookCount++;
        }
        return bookCount;
    }

}
