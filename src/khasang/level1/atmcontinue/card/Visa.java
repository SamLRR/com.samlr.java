package khasang.level1.atmcontinue.card;

import khasang.level1.atmcontinue.bank.Bank;

import java.util.Date;

public class Visa extends Card {
    private Bank account;
    public Visa(String name, Date dateOfExpiry, Bank account) {
        super(name, dateOfExpiry, account);
    }
}
