package org.learning.service;

import org.learning.model.Account;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class AccountService {

    public void withdraw(Account account, BigDecimal amount) {
        if(amount.compareTo(BigDecimal.ZERO) <= 0) {
            System.out.println("Invalid withdrawal amount. Must be greater than zero.");
            return;
        }
        if(account.getBalance().compareTo(amount) >= 0) {
            System.out.println("Successfully withdraw $: "+ amount);
            System.out.println("\nYour Receipt: ");
            System.out.printf("Balance -  " + account.getBalance());
            System.out.println("Amount withdrawn - " + amount);
            account.setBalance(account.getBalance().subtract(amount));
            System.out.printf("Current Balance - " + account.getBalance().setScale(2, RoundingMode.HALF_UP));

        } else {
            System.out.println("Insufficient Balance. Please enter another amount.");
        }
    }

    public void deposit(Account account, BigDecimal amount) {
        if(amount.compareTo(BigDecimal.ZERO) <= 0) {
            System.out.println("Invalid withdrawal amount. Must be greater than zero.");
            return;
        }
        System.out.println("Successfully deposited: $" + amount);
        account.setBalance(account.getBalance().add(amount));
        System.out.println("Current Balance; " + account.getBalance());
    }

    public void checkBalance(Account account) {
        System.out.println("Current Balance $: " + account.getBalance().setScale(2, RoundingMode.HALF_UP));
    }
}
