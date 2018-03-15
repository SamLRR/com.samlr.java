package khasang.level1.atmcontinue.bank;

import khasang.level1.atmcontinue.card.Card;

import java.math.BigInteger;
import java.util.*;

public class Bank {
    private Client client;
    private BankAccount bankAccount;
    private Pin pin;
    private static int numberCard = 12340000;
    private static Map<BankAccount, Client> clientMap = new HashMap<>();
    private static Map<Pin, BankAccount> pinBankAccountMap = new HashMap<>();


    public Bank() { // обязательно создавать пустой конструктор
    }

    public Bank(BankAccount bankAccount, Client client, Pin pin) {
        this.bankAccount = bankAccount;
        this.client = client;
        this.pin = pin;
        clientMap.put(bankAccount, client);
        pinBankAccountMap.put(pin, bankAccount);
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public Pin getPin() {
        return pin;
    }

    public void setPin(Pin pin) {
        this.pin = pin;
    }

    public static Map<BankAccount, Client> getClientMap() {
        return clientMap;
    }

    public static Map<Pin, BankAccount> getPinBankAccountMap() {
        return pinBankAccountMap;
    }

    public BigInteger getBalanceOfCount() {
        BigInteger balanceOfCount = BigInteger.valueOf(0);
        for (Map.Entry<BankAccount, Client> entry : clientMap.entrySet()) {
            if (entry.getValue().equals(client)) {
                balanceOfCount = entry.getKey().getAccountBalance();
            }
        }
        return balanceOfCount;
    }

    public void setBalanceOfCount(BigInteger balanceCount) {
        bankAccount.setAccountBalance(balanceCount);
    }

    /**
     * Просмотр информации по всем клиентам и их счетам
     */
    public void getClientsInfo() {
        clientMap.forEach((s, client) ->
                System.out.println("Счёт № " + s.getNumber() + ". Владелец: " + client + ". Остаток на счете: " + getClientBalance(s, client)));

    }

    /**
     * Возвращает баланс  счёта клиента
     */
    private BigInteger getClientBalance(BankAccount bankAccount, Client client) {
        BigInteger balance = BigInteger.valueOf(0);
        for (Map.Entry<BankAccount, Client> entry : clientMap.entrySet()) {
            if ((bankAccount.getNumber() == (entry.getKey().getNumber())) && client.equals(entry.getValue())) {
                balance = entry.getKey().getAccountBalance();
            }
        }
        return balance;
    }

    /**
     * Возвращает баланс карты по пин-коду
     */

    public BigInteger getBalancePin(int pin) {
        BigInteger balance = BigInteger.valueOf(0);
        for (Map.Entry<Pin, BankAccount> entry : pinBankAccountMap.entrySet()) {
            if (pin == entry.getKey().getPin()) {
                balance = entry.getValue().getAccountBalance();
            }
        }
        return balance;
    }

    /**
     * Возвращает клиента по пин-коду
     */

    public Client getClientPin(int pincode) {
        Client client = new Client();
        for (Map.Entry<BankAccount, Client> entryClient : clientMap.entrySet()) {
            for (Map.Entry<Pin, BankAccount> entryPin : pinBankAccountMap.entrySet()) {
                if (pincode == entryPin.getKey().getPin() && entryClient.getKey().getNumber() == entryPin.getValue().getNumber()) {
                    client = entryClient.getValue();
                }
            }
        }
        return client;
    }

    /**
     * Проверяет правильность(содержиться ли в set-е) пин-кода
     */

    public boolean havePinCode(int pin) {
        return Pin.getHashSetPin().contains(pin);
    }

    /**
     * Просмотр информации по одному клиенту и всем его счетам
     */

    public void getClientInfo(Client client) {
        BigInteger balance;
        for (Map.Entry<BankAccount, Client> entry : clientMap.entrySet()) {
            final Client value = entry.getValue();
            final BankAccount key = entry.getKey();
            if (client.equals(value)) {
                balance = key.getAccountBalance();
                System.out.println(value.toString() + " счёт № " + key.getNumber() + ". Остаток  " + balance); // исправлено
            }
        }
    }

    /**
     * Просмотр информации по конкректному счету
     */
    public void getAccountInfo(BankAccount account) {
        for (Map.Entry<BankAccount, Client> entry : clientMap.entrySet()) {
            if (account.equals(entry.getKey())) {
                System.out.println("Счет № " + account.getNumber() + ". Владелец: " + entry.getValue().toString() + " Остаток на счете: " + account.getAccountBalance());
            }
        }
    }

}
