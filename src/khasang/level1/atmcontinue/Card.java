package khasang.level1.atmcontinue;

import java.util.Date;

public abstract class Card {
    private String nameOfCard;
    private Date dateOfExpiry;
    private Bank bank;
    private BankAccount currentAccount;
    private String nameOfOwner;

    public Card(String nameOfCard, Date dateOfExpiry, Bank bank) {
        this.nameOfCard = nameOfCard;
        this.dateOfExpiry = dateOfExpiry;
        this.bank = bank;
        currentAccount=bank.getBankAccount();
    }

    public BankAccount getCurrentAccount() {
        return currentAccount;
    }

    public int balance() {
        return bank.getBalanceOfCount();
    }

    public void withDraw(int sum) {
        if (balance() >= sum) {
            bank.setBalanceOfCount(balance() - sum);
            System.out.println("Снятие наличных: " + sum);
        } else {
            System.out.println("Недостаточно средств");
        }
    }
}
