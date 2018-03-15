package khasang.level1.atmcontinue.card;

import khasang.level1.atmcontinue.bank.Bank;
import khasang.level1.atmcontinue.bank.BankAccount;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Card {
    private String nameCard;
    private Date dateExpiryCard;
    private Bank bank;
    private BankAccount currentAccount;

    public Card() {
    }

    public Card(String nameCard, Date dateExpiryCard, Bank bank) {
        this.nameCard = nameCard;
        this.dateExpiryCard = dateExpiryCard;
        this.bank = bank;
        this.currentAccount = bank.getBankAccount();
    }

    public String getNameCard() {
        return nameCard;
    }

    public void setNameCard(String nameCard) {
        this.nameCard = nameCard;
    }

    public Date getDateExpiryCard() {
        return dateExpiryCard;
    }

    public void setDateExpiryCard(Date dateExpiryCard) {
        this.dateExpiryCard = dateExpiryCard;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public BankAccount getCurrentAccount() {
        return currentAccount;
    }

    public void setCurrentAccount(BankAccount currentAccount) {
        this.currentAccount = currentAccount;
    }

    private BigInteger balance() {
        return bank.getBalanceOfCount();
    }

    public void withDraw(BigInteger sum) {

        if (sum.compareTo(balance()) < 0) {
            bank.setBalanceOfCount(balance().subtract(sum));
            System.out.println("Снятие наличных: " + sum);
        } else {
            System.out.println("Недостаточно средств");
        }
    }
}
