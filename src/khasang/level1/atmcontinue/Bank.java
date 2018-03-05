package khasang.level1.atmcontinue;

public class Bank {
    private String numberOfCount;
    private int balanceOfCount;

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
