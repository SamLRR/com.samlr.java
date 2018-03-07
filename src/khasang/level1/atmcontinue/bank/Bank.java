package khasang.level1.atmcontinue.bank;

import java.math.BigInteger;
import java.util.*;

public class Bank {
    private Client client;
    private BankAccount bankAccount;
    private static Map<BankAccount, Client> clientMap = new HashMap<>();

    public Bank(BankAccount bankAccount, Client client) {
        this.bankAccount = bankAccount;
        this.client = client;
        clientMap.put(bankAccount, client);
    }

    public BankAccount getBankAccount() {
        return bankAccount;
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

    public void setBalanceOfCount(BigInteger balanceOfCount) {
        bankAccount.setAccountBalance(balanceOfCount);
    }

    /**
     * Просмотр информации по всем клиентам и их счетам
     */
    public static void getClientsInfo() {
        clientMap.forEach((s, client) ->
                System.out.println("Счёт № " + s + ". Владелец: " + client + ". Остаток на счете: " + getClientBalance(client)));

    }

    private static BigInteger getClientBalance(Client client) {
        BigInteger balance = BigInteger.valueOf(0);
        for (Map.Entry<BankAccount, Client> entry : clientMap.entrySet()) {
            if (client.equals(entry.getValue())) {
                balance = entry.getKey().getAccountBalance();
            }
        }
        return balance;
    }

    /**
     *Просмотр информации по одному клиенту и всем его счетам
     */
    public static BigInteger getClientInfo(Client client) {
        BigInteger balance = BigInteger.valueOf(0);
        for (Map.Entry<BankAccount, Client> entry : clientMap.entrySet()) {
            if (client.equals(entry.getValue())) {
                balance = entry.getKey().getAccountBalance();
                System.out.println(entry.getValue() + " счёт № " + entry.getKey() + ". Остаток  " + balance);
            }
        }
        return balance;
    }

    /**
     * Просмотр информации по конкректному счету
     */
    public static void getAccountInfo(BankAccount account11) {

        System.out.println("Счет № "+account11.getNumber() + ". Владелец: " + " Остаток на счете: "+account11.getAccountBalance());
    }
}
