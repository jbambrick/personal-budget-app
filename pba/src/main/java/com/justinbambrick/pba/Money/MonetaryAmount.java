package com.justinbambrick.pba.Money;

import java.util.Currency;
import java.util.Locale;

public class MonetaryAmount {
    private Currency currency;

    private double amount;

    public MonetaryAmount(double amount) {
        this.amount = amount;

        this.currency = Currency.getInstance(Locale.CANADA);
    }

    public double getValue() {
        return this.amount;
    }
}
