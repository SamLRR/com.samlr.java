package khasang.level1.atmcontinue.card;

import khasang.level1.atmcontinue.bank.Bank;
import khasang.level1.atmcontinue.bank.BankAccount;

import java.math.BigInteger;
import java.util.Date;

public abstract class Card {
    private String nameOfCard;
    private Date dateOfExpiry;
    private Bank bank;
    private BankAccount currentAccount;
    private String nameOfOwner;

    protected Card(String nameOfCard, Date dateOfExpiry, Bank bank) {
        this.nameOfCard = nameOfCard;
        this.dateOfExpiry = dateOfExpiry;
        this.bank = bank;
        currentAccount=bank.getBankAccount();
    }

    public BankAccount getCurrentAccount() {
        return currentAccount;
    }

    public BigInteger balance() {
        return bank.getBalanceOfCount();
    }

    public void withDraw(int sum) {
        if (BigInteger.valueOf(sum).compareTo(balance())<0/*balance() >= sum*/) {
            bank.setBalanceOfCount(balance().subtract(BigInteger.valueOf(sum)));
            System.out.println("Снятие наличных: " + sum);
        } else {
            System.out.println("Недостаточно средств");
        }
    }
}
