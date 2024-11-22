package com.justinbambrick.pba.Bills;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.justinbambrick.pba.Money.MonetaryAmount;
import com.justinbambrick.pba.Money.Payment;
import com.justinbambrick.pba.sources.Frequency;

public class Bill {

    private String id;

    private String name;

    private MonetaryAmount amount;

    private Frequency frequency;

    private Date startDate;

    public Bill(String id, String name, double ammount, Frequency frequency, Date date) {

        this.id = id;

        this.name = name;

        this.amount = new MonetaryAmount(ammount);

        this.startDate = date;

    }

    public String toString() {
        return "Bill: " + id + ", name: " + name + " monetary amount: " + amount.getValue() + "frequency"
                + frequency
                + "Date: " + startDate;
    }

    public Bill setAmount(MonetaryAmount updatedAmount) {

        amount = updatedAmount;

        return this;
    }

    public List<Payment> getExpectedCharges(Date date) {
        List<Payment> list = new ArrayList<Payment>();

        // TODO add expected payments to the list
        return list;

    }
}