package com.bank.cards;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreditCardTest {

  // Позитивные тесты

  @Test(groups = "positive")
  public void testCreditCardCreation() {
    CreditCard card = new CreditCard("USD", 1000.0, "John Doe", 0.15);
    Assert.assertNotNull(card, "CreditCard instance should be created.");
    Assert.assertEquals(card.getBalance(), 1000.0, "Initial balance should be 1000.0");
    Assert.assertEquals(card.getInterestRate(), 0.15, "Initial interest rate should be 0.15");
  }

  @Test(groups = "positive")
  public void testCreditCardDeposit() {
    CreditCard card = new CreditCard("USD", 1000.0, "John Doe", 0.15);
    card.deposit(500.0);
    Assert.assertEquals(card.getBalance(), 1500.0, "Balance after deposit should be 1500.0");
  }

  @Test(groups = "positive")
  public void testCreditCardWithdrawal() {
    CreditCard card = new CreditCard("USD", 1000.0, "John Doe", 0.15);
    card.withdraw(200.0);
    Assert.assertEquals(card.getBalance(), 800.0, "Balance after withdrawal should be 800.0");
  }

  @Test(groups = "positive")
  public void testCreditCardInterestRate() {
    CreditCard card = new CreditCard("USD", 1000.0, "John Doe", 0.15);
    card.setInterestRate(0.20);
    Assert.assertEquals(card.getInterestRate(), 0.20, "Interest rate should be updated to 0.20");
  }

  // Негативные тесты

  @Test(groups = "negative", expectedExceptions = IllegalArgumentException.class)
  public void testCreditCardWithdrawExceedingBalance() {
    CreditCard card = new CreditCard("USD", 1000.0, "John Doe", 0.15);
    card.withdraw(1500.0); // Ожидается исключение при снятии суммы, превышающей баланс
  }

}
