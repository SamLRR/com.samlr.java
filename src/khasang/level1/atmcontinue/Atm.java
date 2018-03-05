package khasang.level1.atmcontinue;

public class Atm {
    private Card card;

    public void setCard(Card card) {
        this.card = card;
    }

    boolean insertCard() {
        if (card == null) {
            return false;
        } else {
            return true;
        }
    }

    void ejectCard() {
        if (card == null) {
            System.out.println("В банкомате нет карты");
        } else {
            card = null;
            System.out.println("Заберите Вашу карту");
        }
    }

    public void withDraw(int sum) {
        if (insertCard()) {
            card.withDraw(sum);
        }  else{
            System.out.println("В банкомате нет карты");
        }
    }

    void showBalance() {
        if (insertCard()) {
            System.out.println(card.balance());
        }
    }
}
