package com.justinbambrick.pba;

import java.util.Date;

import com.justinbambrick.pba.Bills.Bill;
import com.justinbambrick.pba.Money.MonetaryAmount;
import com.justinbambrick.pba.sources.Frequency;
import com.justinbambrick.pba.sources.IncomeSource;

public class Main {
    public static void main(String[] args) {
        IncomeSource source = new IncomeSource("123", "TNG", 100.50, Frequency.biWeekly, new Date(2024, 11, 7));

        Bill sourceBill = new Bill("122", "Telus", 1200.00,Frequency.monthly,new Date(2024, 11, 7));

        System.out.println(source);
        System.out.println(sourceBill);

        sourceBill.setAmount(new MonetaryAmount(540.00));

        System.out.println(sourceBill);

    }
}