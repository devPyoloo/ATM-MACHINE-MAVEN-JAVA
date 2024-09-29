package org.learning.controller;

import org.learning.model.Account;
import org.learning.service.AccountService;
import org.learning.util.InputUserHandler;

import java.math.BigDecimal;
import java.util.Scanner;

public class ATMmachine {
    private final InputUserHandler inputUserHandler;
    private final AccountService accountService;

    public ATMmachine() {
        this.inputUserHandler = new InputUserHandler();
        this.accountService = new AccountService();
    }

    public void start(Account account) {
        System.out.println("Welcome to the ATM MACHINE");
        String pin = inputUserHandler.getPin();

        if(account.getPin().equals(pin)) {
            System.out.println("Verification complete!");
            boolean running = true;

            while(running) {

                int choice = inputUserHandler.getUserChoice();
                switch (choice) {
                    case 1:
                        System.out.println("Check Balance\n");
                        accountService.checkBalance(account);
                        break;

                    case 2:
                        System.out.println("Withdraw\n");
                        BigDecimal amount = inputUserHandler.getAmount("withdraw");
                        accountService.withdraw(account, amount);
                        break;

                    case 3:
                        System.out.println("Deposit\n");
                        BigDecimal depositAmount = inputUserHandler.getAmount("deposit");
                        accountService.deposit(account, depositAmount);
                        break;

                    case 4:
                        running = false;
                        System.out.println("Exiting application...\nThank you for using the application.");
                        break;

                    default:
                        System.out.println("Please select a valid option.");
                        break;
                }
            }

        } else {
            System.out.println("Incorrect pin code. Please try again.");
        }

    }
}
