package khasang.level1.atm;

public class Main {
    public static void main(String[] args) {
        Atm atm =new Atm();
        Card card = new Visa();
        Card card1 = new Visa();

        card.setBalance(100);
        atm.insertCard(card);
        atm.showBalance();
        atm.withdraw(20);
        atm.showBalance();
        atm.eject();
    }
}
