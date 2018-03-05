package khasang.level1.atmcontinue;

import java.util.Map;

public class Bank {
    private String numberOfCount;
    private int balanceOfCount;
    private Map<Integer,Client> clientMap;

    public Bank(String numberOfCount, int balanceOfCount) {
        this.numberOfCount = numberOfCount;
        this.balanceOfCount = balanceOfCount;
    }

    public int getBalanceOfCount() {
        return balanceOfCount;
    }

    public void setBalanceOfCount(int balanceOfCount) {
        this.balanceOfCount = balanceOfCount;
    }
}
