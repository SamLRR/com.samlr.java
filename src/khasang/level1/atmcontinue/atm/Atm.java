package khasang.level1.atmcontinue.atm;


import khasang.level1.atmcontinue.card.Card;

import java.math.BigInteger;

public class Atm {
    private Card card;

    public Atm(Card card) { // необходимо всегда делать такой конструктор
        this.card = card;
    }

    public Atm() {  // необходимо всегда делать такой пустой конструктор
    }

    public Card getCard() { // геттер тоже нужно всегда делать
        return card;
    }

    public void setCard(Card card) {
        if (insertCard()) {
            System.out.println("В банкомате уже есть карта, попробуйте попозже");
        } else
            this.card = card;
    }

    private boolean insertCard() { // если не оговорено иное, то делайте доступ private
        if (card == null) {
            return false;
        } else {
            return true;
        }
    }

    public void ejectCard() {
        if (card == null) {
            showMessage();
        } else {
            card = null;
            System.out.println("Заберите Вашу карту");
        }
    }

    public void withDraw(int sum) {
        BigInteger biSum = getBiSum(sum);// сделаем тогда тип данных BigInteger раз везде используем
        if (insertCard()) {
            card.withDraw(biSum);
        } else {
            showMessage();
        }
    }

    private BigInteger getBiSum(int sum) {
        return BigInteger.valueOf(sum);
    }

    public void showBalance() {
        if (insertCard()) {
            System.out.println("На счете осталось: " + card.getCurrentAccount().getAccountBalance());
        } else {
            showMessage();
        }
    }

    private void showMessage() { // если не оговорено иное, то делайте доступ private доступ только внутри класса
        System.out.println("В банкомате нет карты");
    }
}
