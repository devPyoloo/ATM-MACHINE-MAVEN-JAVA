package org.learning.model;

import java.math.BigDecimal;

public class Account {
    private final String accountNumber;
    private BigDecimal balance;
    private final String pin;

    public Account(String accountNumber, BigDecimal balance, String pin) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.pin = pin;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public String getPin() {
        return pin;
    }

    public void setBalance(BigDecimal setBalance) {
        this.balance = setBalance;
    }


}
