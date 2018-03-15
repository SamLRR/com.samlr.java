package khasang.level1.atmcontinue.main;

import khasang.level1.atmcontinue.atm.Atm;
import khasang.level1.atmcontinue.bank.Bank;
import khasang.level1.atmcontinue.bank.BankAccount;
import khasang.level1.atmcontinue.bank.Client;
import khasang.level1.atmcontinue.bank.Pin;
import khasang.level1.atmcontinue.card.Card;
import khasang.level1.atmcontinue.card.Visa;

import java.math.BigInteger;
import java.util.Date;
import java.util.Scanner;

public class Test {
    private Scanner scanner = new Scanner(System.in);
    private Bank bank = new Bank();
    private Client client;
    private Atm atm;
    private Card cardIvanov1;
    private Card cardIvanov2;
    private Card cardIvanov3;
    private Card cardSamson1;


    public void init() {
        atm = new Atm();
        Client client1 = new Client("Василий", "Иванов");
        Client client2 = new Client("Петр", "Самсонов");
        BankAccount account11 = new BankAccount(408170001, BigInteger.valueOf(2000));
        BankAccount account12 = new BankAccount(408170002, BigInteger.valueOf(3000));
        BankAccount account21 = new BankAccount(408170003, BigInteger.valueOf(10000));
        cardIvanov1 = new Visa("ВТБ", new Date(12 / 03 / 2018), new Bank(account11, client1, new Pin()));
        cardIvanov2 = new Visa("ВТБ", new Date(12 / 03 / 2018), new Bank(account11, client1, new Pin()));
        cardIvanov3 = new Visa("ВТБ", new Date(12 / 03 / 2018), new Bank(account12, client1, new Pin()));
        cardSamson1 = new Visa("ВТБ", new Date(12 / 03 / 2018), new Bank(account21, client2, new Pin()));
    }

    private void showMenu() {
        System.out.println();
        System.out.println("Выберите тип операции:");
        System.out.println("1. Вывести информацию по всем клиентам");
        System.out.println("2. Операции по карте");
        System.out.println("3. Выход\n");
    }

    public void start() {
        int input = 0;
        do {
            showMenu();
            input = scanner.nextInt();
            switch (input) {
                case 1:
                    bank.getClientsInfo();
                    break;
                case 2:
                    dialogClient();
                    break;
            }

        } while (input != 3);
    }

    private void dialogClient() {
        choiceCard();
        System.out.println("Наберите пин-код");
        int input = scanner.nextInt();
//        int input = 1004;
        if (bank.havePinCode(input)) {
            client = bank.getClientPin(input);
            System.out.println("Добрый день, " + client.toString() + "!\nВаши данные:");
            bank.getClientInfo(client);
            operationClient();
        } else {
            System.out.println("Извините, Вы ввели неверный пин-код");
        }
    }

    private void choiceCard() {
        System.out.println("Вставьте карту(введите 1, 2, 3, 4)");
        int input = scanner.nextInt();
        switch (input) {
            case 1:
                atm.setCard(cardIvanov1);
                break;
            case 2:
                atm.setCard(cardIvanov2);
                break;
            case 3:
                atm.setCard(cardIvanov3);
                break;
            case 4:
                atm.setCard(cardSamson1);
                break;
        }
    }

    private void operationClient() {
        System.out.println("Для снятия наличных нажмите 1, или 0 для возврата в меню");
        int input = scanner.nextInt();
        switch (input) {
            case 1:
                withDrawClient();
                break;
            case 0:
                System.out.println("Всего доброго!");
                break;
        }
    }

    private void withDrawClient() {
        int input;
        System.out.println("Введите сумму");
        input = scanner.nextInt();
        atm.withDraw(input);
        atm.showBalance();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }
        atm.ejectCard();
    }

    private boolean haveClient(Client client) {
        return Bank.getClientMap().containsValue(client);
    }
}
