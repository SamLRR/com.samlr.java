package khasang.level1.atmcontinue;

import java.util.*;

public class Bank {
    private int numberOfCount;
    private int balanceOfCount;
    private Client client;
    private BankAccount bankAccount;
    private List<Client> clients = new ArrayList<>();
    private static Map<BankAccount, Client> clientMap = new HashMap<>();

    public Bank(BankAccount bankAccount, Client client) {
        this.bankAccount = bankAccount;
        this.client = client;
        clientMap.put(bankAccount, client);
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public int getBalanceOfCount() {
        int balanceOfCount = 0;
        for (Map.Entry<BankAccount, Client> entry : clientMap.entrySet()) {
            if (entry.getValue().equals(client)) {
                balanceOfCount = entry.getKey().getAccountBalance();
            }
        }
        return balanceOfCount;
    }

    public void setBalanceOfCount(int balanceOfCount) {
        bankAccount.setAccountBalance(balanceOfCount);
    }

    static void getClientsInfo() {
        clientMap.forEach((s, client) ->
                System.out.println("Счёт № " + s + ". Владелец: " + client + ". Остаток на счете: " + getClientBalance(client)));

    }

    private static int getClientBalance(Client client) {
        int balance = 0;
        for (Map.Entry<BankAccount, Client> entry : clientMap.entrySet()) {
            if (client.equals(entry.getValue())) {
                balance = entry.getKey().getAccountBalance();
            }
        }
        return balance;
    }

    static int getClientInfo(Client client) {
        int balance = 0;
        for (Map.Entry<BankAccount, Client> entry : clientMap.entrySet()) {
            if (client.equals(entry.getValue())) {
                balance = entry.getKey().getAccountBalance();
                System.out.println(entry.getValue() + " счёт № " + entry.getKey() + ". Остаток  " + balance);
            }
        }
        return balance;
    }

    public static void getAccountInfo(BankAccount account11) {

        System.out.println("Счет № "+account11.getNumber() + ". Владелец: " + " Остаток на счете: "+account11.getAccountBalance());
    }
}
