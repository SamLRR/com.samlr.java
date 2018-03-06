package khasang.level1.atmcontinue;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        doSmth();
    }

    public static void doSmth() {
        Atm atm = new Atm();
        Client client1 = new Client("Василий", "Иванов");
        Client client2 = new Client("Петр", "Самсонов");
        BankAccount account11 = new BankAccount(480001, 2500);
        BankAccount account12 = new BankAccount(480002, 3500);
        BankAccount account21 = new BankAccount(480003, 10000);
        BankAccount account22 = new BankAccount(480004, 5000);
        Card vtb11 = new Visa("ВТБ", new Date(12 / 03 / 2020), new Bank(account11, client1));
        Card vtb12 = new Visa("ВТБ", new Date(12 / 03 / 2020), new Bank(account12, client1));
        Card vtb21 = new Visa("ВТБ", new Date(12 / 03 / 2020), new Bank(account21, client2));
        atm.setCard(vtb21);
        atm.setCard(vtb12);
        atm.withDraw(200);
        atm.showBalance();
        atm.withDraw(200);
        atm.showBalance();
//        atm.withDraw(200);
        Bank.getClientsInfo();//Информация по всем клиентам
        Bank.getClientInfo(client1);//Информация по клиенту
        Bank.getClientInfo(client2);
        Bank.getAccountInfo(account11);
//        atm.ejectCard();
    }
}
