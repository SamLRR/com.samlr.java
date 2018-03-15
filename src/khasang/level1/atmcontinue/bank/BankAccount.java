package khasang.level1.atmcontinue.bank;

import java.math.BigInteger;

/**
 * Банковский счет
 */
public class BankAccount {
    private int number;
    private BigInteger accountBalance;

    public BankAccount(int number, BigInteger accountBalance) {
        this.number = number;
        this.accountBalance = accountBalance;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public BigInteger getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(BigInteger accountBalance) {
        this.accountBalance = accountBalance;
    }
}
