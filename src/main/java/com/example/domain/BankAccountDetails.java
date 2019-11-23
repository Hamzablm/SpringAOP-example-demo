package com.example.domain;

public class BankAccountDetails {
    private int accountId;
    private int balanceAmount;

    public BankAccountDetails(int accountId, int balanceAmount) {
        this.accountId = accountId;
        this.balanceAmount = balanceAmount;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public int getBalanceAmount() {
        return balanceAmount;
    }

    public void setBalanceAmount(int balanceAmount) {
        this.balanceAmount = balanceAmount;
    }

    @Override
    public String toString() {
        return "BankAccountDetails{" + "accountId=" + accountId +
                ", balanceAmount=" + balanceAmount +
                '}';
    }
}
