package com.bank.cards;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DebitCardTest {

  // Positive test cases

  @Test(groups = "positive")
  public void testDebitCardDepositPositiveAmount() {
    DebitCard card = new DebitCard("USD", 1000.0, "John Doe");
    card.deposit(500.0);
    Assert.assertEquals(card.getBalance(), 1500.0, "Balance should be 1500 after deposit");
  }

  @Test(groups = "positive")
  public void testDebitCardWithdrawPositiveAmount() {
    DebitCard card = new DebitCard("USD", 1000.0, "John Doe");
    card.withdraw(200.0);
    Assert.assertEquals(card.getBalance(), 800.0, "Balance should be 800 after withdrawal");
  }

  @Test(groups = "positive")
  public void testDebitCardGetBalance() {
    DebitCard card = new DebitCard("USD", 1000.0, "John Doe");
    Assert.assertEquals(card.getBalance(), 1000.0, "Balance should be 1000");
  }

  @Test(groups = "positive")
  public void testDebitCardGetCurrency() {
    DebitCard card = new DebitCard("USD", 1000.0, "John Doe");
    Assert.assertEquals(card.getCurrency(), "USD", "Currency should be USD");
  }

  // Negative test cases

  @Test(groups = "negative")
  public void testDebitCardWithdrawMoreThanBalance() {
    DebitCard card = new DebitCard("USD", 1000.0, "John Doe");
    Assert.assertThrows(IllegalArgumentException.class, () -> {
      card.withdraw(1200.0);
    });
  }
}
