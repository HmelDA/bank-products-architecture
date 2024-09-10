package com.bank;

import com.bank.cards.Card;
import com.bank.deposits.Deposit;
import com.bank.deposits.RecurringDeposit;
import com.bank.util.BankProductCreator;

public class BankApplication {

  public static void main(String[] args) {

    // Создание карт
    Card creditCard = BankProductCreator.createCard("credit", "USD", 1000.0, "My Credit Card", 5.0);
    Card debitCard = BankProductCreator.createCard("debit", "USD", 500.0, "My Debit Card");
    Card currencyDebitCard = BankProductCreator.createCard("currency", "EUR", 200.0, "My Currency Debit Card");

    // Создание депозитов
    Deposit fixedDeposit = BankProductCreator.createDeposit("fixed", "USD", 5000.0, "My Fixed Deposit");
    Deposit recurringDeposit = BankProductCreator.createDeposit("recurring", "USD", 3000.0, "My Recurring Deposit");

    // Операции с картами
    System.out.println("Credit Card:");
    System.out.println("Name: " + creditCard.getName());
    System.out.println("Balance: " + creditCard.getBalance());
    creditCard.deposit(200.0);
    System.out.println("Balance after deposit: " + creditCard.getBalance());
    creditCard.withdraw(100.0);
    System.out.println("Balance after withdrawal: " + creditCard.getBalance());

    System.out.println("\nDebit Card:");
    System.out.println("Name: " + debitCard.getName());
    System.out.println("Balance: " + debitCard.getBalance());
    debitCard.deposit(100.0);
    System.out.println("Balance after deposit: " + debitCard.getBalance());
    debitCard.withdraw(50.0);
    System.out.println("Balance after withdrawal: " + debitCard.getBalance());

    System.out.println("\nCurrency Debit Card:");
    System.out.println("Name: " + currencyDebitCard.getName());
    System.out.println("Balance: " + currencyDebitCard.getBalance());
    currencyDebitCard.deposit(50.0);
    System.out.println("Balance after deposit: " + currencyDebitCard.getBalance());

    // Операции с депозитами
    System.out.println("\nFixed Deposit:");
    System.out.println("Name: " + fixedDeposit.getName());
    System.out.println("Balance: " + fixedDeposit.getBalance());
    fixedDeposit.deposit(1000.0);
    System.out.println("Balance after deposit: " + fixedDeposit.getBalance());

    System.out.println("\nRecurring Deposit:");
    System.out.println("Name: " + recurringDeposit.getName());
    System.out.println("Balance: " + recurringDeposit.getBalance());
    recurringDeposit.deposit(500.0);
    System.out.println("Balance after deposit: " + recurringDeposit.getBalance());

    // Попробуем закрыть депозит
    if (recurringDeposit instanceof RecurringDeposit) {
      recurringDeposit.close();
      System.out.println("Recurring deposit closed.");
    }
  }
}
