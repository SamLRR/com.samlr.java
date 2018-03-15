package khasang.level1.atm;

public class Atm {
    private Card currentCard;

    void insertCard(Card card) {
        if (currentCard == null) {
            currentCard = card;
            System.out.println("Вставили карту");
        } else {
            System.out.println("В банкомате уже вставлена карта\nпопробуйте позже");
            eject();
        }
    }

    void eject() {
        currentCard = null;
        System.out.println("Карта вынута из банкомата");
    }

    void showBalance() {
        if (currentCard == null) {
            System.out.println("Неудачная попытка просмотра баланса, вставьте карту");
        } else {
            System.out.println("Ваш баланс: " + currentCard.getBalance());
        }
    }

    void withdraw(int amount) {
        if (currentCard == null) {
            System.out.println("Неудачная попытка снятия денег, вставьте карту");
        } else {
            currentCard.withdraw(amount);
        }
    }
}
