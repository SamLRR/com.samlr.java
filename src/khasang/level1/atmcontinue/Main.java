package khasang.level1.atmcontinue;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        doSmth();
    }

    public static void doSmth() {
        Atm atm = new Atm();
        Card vtb=new Visa("ВТБ",new Date(12/03/2020), new Bank("0001",2000));
        atm.setCard(vtb);
        atm.insertCard();
        atm.withDraw(200);
        atm.showBalance();
        atm.withDraw(200);
        atm.showBalance();
        atm.withDraw(2000);
        atm.ejectCard();
    }
}
