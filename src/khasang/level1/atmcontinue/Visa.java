package khasang.level1.atmcontinue;

import java.util.Date;

public class Visa extends Card {
    private Bank account;
    public Visa(String name, Date dateOfExpiry, Bank account) {
        super(name, dateOfExpiry, account);
    }
}
