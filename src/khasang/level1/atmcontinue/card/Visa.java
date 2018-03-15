package khasang.level1.atmcontinue.card;

import khasang.level1.atmcontinue.bank.Bank;

import java.util.Date;

public class Visa extends Card {

    public Visa() {
    }

    public Visa(String nameOfCard, Date dateOfExpiry, Bank bank) {
        super(nameOfCard, dateOfExpiry, bank);
    }


}
