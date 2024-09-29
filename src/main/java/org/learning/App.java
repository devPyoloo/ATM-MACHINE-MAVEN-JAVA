package org.learning;

import org.learning.controller.ATMmachine;
import org.learning.model.Account;

import java.math.BigDecimal;


public class App 
{
    public static void main( String[] args )
    {
        // Account credentials
        Account account = new Account("080902", new BigDecimal(2000.00), "0809");

        // Start the machine
        ATMmachine atmMachine = new ATMmachine();
        atmMachine.start(account);
    }
}
