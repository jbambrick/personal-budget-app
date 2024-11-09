package com.justinbambrick.pba.Money;

import java.util.Date;

public class Payment {
    private Date date;

    private MonetaryAmount amount;

    public Payment(Date date, MonetaryAmount amount) {

        this.amount = amount;

        this.date = date;
    }

    public double getValue() {
        return amount.getValue();
    }
}
