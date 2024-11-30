package com.justinbambrick.pba.sources;

import java.util.Date;

import com.justinbambrick.pba.Money.MonetaryAmount;

public class IncomeSource {

    private String id;

    private String name;

    private MonetaryAmount amount;

    private Frequency frequency;

    private Date startDate;

    public IncomeSource(String id, String name, double ammount, Frequency frequency, Date date) {

        this.id = id;

        this.name = name;

        this.amount = new MonetaryAmount(ammount);

        this.startDate = date;

    }

    public String toString() {
        return "Income Source: " + id + ", name: " + name + " monetary amount: " + amount.getValue() + "frequency"
                + frequency
                + "Date: " + startDate;
    }
}
