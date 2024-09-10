package com.bank.cards;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CurrencyDebitCardTest {

  // Positive test cases

  @Test(groups = "positive")
  public void testCurrencyDebitCardDeposit() {
    CurrencyDebitCard card = new CurrencyDebitCard("USD", 1000.0, "Test Card");
    card.deposit(500.0);
    Assert.assertEquals(card.getBalance(), 1500.0, "Balance should be updated correctly after deposit.");
  }

  @Test(groups = "positive")
  public void testCurrencyDebitCardWithdraw() {
    CurrencyDebitCard card = new CurrencyDebitCard("USD", 1000.0, "Test Card");
    card.withdraw(500.0);
    Assert.assertEquals(card.getBalance(), 500.0, "Balance should be updated correctly after withdrawal.");
  }

  @Test(groups = "positive")
  public void testCurrencyDebitCardDepositBoundary() {
    CurrencyDebitCard card = new CurrencyDebitCard("USD", 1000.0, "Test Card");
    card.deposit(0.0);
    Assert.assertEquals(card.getBalance(), 1000.0, "Balance should remain unchanged after depositing zero.");
  }

  @Test(groups = "positive")
  public void testCurrencyDebitCardWithdrawBoundary() {
    CurrencyDebitCard card = new CurrencyDebitCard("USD", 1000.0, "Test Card");
    card.withdraw(0.0);
    Assert.assertEquals(card.getBalance(), 1000.0, "Balance should remain unchanged after withdrawing zero.");
  }

  // Negative test cases

  @Test(groups = "negative", expectedExceptions = IllegalArgumentException.class)
  public void testCurrencyDebitCardWithdrawExceedsBalance() {
    CurrencyDebitCard card = new CurrencyDebitCard("USD", 1000.0, "Test Card");
    card.withdraw(1500.0);
  }
}
