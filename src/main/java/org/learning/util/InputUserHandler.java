package org.learning.util;

import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputUserHandler {
    Scanner scanner;

    public InputUserHandler() {
        scanner = new Scanner(System.in);
    }

    public int getUserChoice() {
        try {
            System.out.println("\nSelect an option...");
            System.out.println("1. Check balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");
            System.out.println();
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number");
            scanner.next();
            return -1;
        }
    }

    public BigDecimal getAmount(String action) {
        System.out.println("Enter amount to "+action+ " :");
        return scanner.nextBigDecimal();
    }

    public String getPin(){
        System.out.println("Enter you pin: ");
        return scanner.nextLine();

    }

}
