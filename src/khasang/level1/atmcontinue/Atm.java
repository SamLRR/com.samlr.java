package khasang.level1.atmcontinue;

public class Atm {
    private Card card;

    public void setCard(Card card) {
        if(insertCard()){
            System.out.println("В банкомате уже есть карта, попробуйте попозже");
        } else
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
            showMessage();
        } else {
            card = null;
            System.out.println("Заберите Вашу карту");
        }
    }

    public void withDraw(int sum) {
        if (insertCard()) {
            card.withDraw(sum);
        } else {
            showMessage();
        }
    }

    void showBalance() {
        if (insertCard()) {
            System.out.println("На счете осталось: " + card.getCurrentAccount().getAccountBalance());
        } else {
            showMessage();
        }
    }

    public void showMessage() {
        System.out.println("В банкомате нет карты");
    }
}
