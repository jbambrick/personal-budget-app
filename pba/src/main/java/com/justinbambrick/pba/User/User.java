package com.justinbambrick.pba.User;

import java.util.Date;
import java.util.List;

import com.justinbambrick.pba.Bills.Bill;
import com.justinbambrick.pba.sources.IncomeSource;

public class User {
    private Name name;

    private String id;

    private Date dob;

    private int SocialInsuranceNumber;

    private List<Bill> bills;

    private List<IncomeSource> incomeSources;

    public User(String firstName, String lastName) {
        name = new Name(firstName, lastName);
    }

    public String getName() {
        return name.toString();
    }
}
