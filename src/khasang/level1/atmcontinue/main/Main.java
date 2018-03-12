package khasang.level1.atmcontinue.main;

import khasang.level1.atmcontinue.atm.Atm;
import khasang.level1.atmcontinue.bank.Bank;
import khasang.level1.atmcontinue.bank.BankAccount;
import khasang.level1.atmcontinue.bank.Client;
import khasang.level1.atmcontinue.card.Card;
import khasang.level1.atmcontinue.card.Visa;

import java.math.BigInteger;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        doSmth();
    }

    private  static void doSmth() {
        Atm atm = new Atm();
        Client client1 = new Client("Василий", "Иванов");
        Client client2 = new Client("Петр", "Самсонов");
        BankAccount account11 = new BankAccount(480001, BigInteger.valueOf(2500));
        BankAccount account12 = new BankAccount(480002, BigInteger.valueOf(3500));
        BankAccount account21 = new BankAccount(480003, BigInteger.valueOf(10000));
        BankAccount account22 = new BankAccount(480004, BigInteger.valueOf(5000));
        Card vtb11 = new Visa("ВТБ", new Date(12 / 03 / 2018), new Bank(account11, client1)); // для упрощения я бы сделал дату выпуска как текущую и все
        Card vtb12 = new Visa("ВТБ", new Date(12 / 03 / 2018), new Bank(account12, client1));
        Card vtb21 = new Visa("ВТБ", new Date(12 / 03 / 2018), new Bank(account21, client2));
        atm.setCard(vtb21);
        atm.setCard(vtb12);
        atm.withDraw(200);  // а лучше написать метод в классе Atm перевода из int в BigInteger
        atm.showBalance();
        atm.withDraw(200);
        atm.showBalance();

        Bank bank = new Bank();
        bank.getClientInfo(client1);
        bank.getClientInfo(client2);
    }
}
