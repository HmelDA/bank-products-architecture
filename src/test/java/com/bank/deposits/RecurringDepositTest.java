package com.bank.deposits;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RecurringDepositTest {

  // Positive test cases

  @Test(groups = "positive")
  public void testRecurringDepositCreation() {
    RecurringDeposit deposit = new RecurringDeposit("USD", 1500.0, "Alice Smith");
    Assert.assertEquals(deposit.getBalance(), 1500.0, "Initial balance should be 1500");
    Assert.assertEquals(deposit.getCurrency(), "USD", "Currency should be USD");
    Assert.assertFalse(deposit.isClosed(), "Deposit should not be closed initially");
  }

  @Test(groups = "positive")
  public void testRecurringDepositClose() {
    RecurringDeposit deposit = new RecurringDeposit("USD", 1500.0, "Alice Smith");
    deposit.close();
    Assert.assertTrue(deposit.isClosed(), "Deposit should be closed after calling close()");
  }

  @Test(groups = "positive")
  public void testRecurringDepositDoubleClose() {
    RecurringDeposit deposit = new RecurringDeposit("USD", 1500.0, "Alice Smith");
    deposit.close();
    deposit.close(); // Closing a second time
    Assert.assertTrue(deposit.isClosed(), "Deposit should still be closed after a second close()");
  }

  @Test(groups = "positive")
  public void testRecurringDepositCurrencyAndBalance() {
    RecurringDeposit deposit = new RecurringDeposit("EUR", 2000.0, "Bob Brown");
    Assert.assertEquals(deposit.getBalance(), 2000.0, "Balance should be 2000");
    Assert.assertEquals(deposit.getCurrency(), "EUR", "Currency should be EUR");
  }

  // Negative test cases

  @Test(groups = "negative")
  public void testRecurringDepositZeroBalance() {
    RecurringDeposit deposit = new RecurringDeposit("USD", 0.0, "Alice Smith");
    Assert.assertEquals(deposit.getBalance(), 0.0, "Balance should be 0");
    Assert.assertFalse(deposit.isClosed(), "Deposit should not be closed initially");
  }

  @Test(groups = "negative")
  public void testRecurringDepositCloseWithoutChange() {
    RecurringDeposit deposit = new RecurringDeposit("USD", 1500.0, "Alice Smith");
    deposit.close(); // Close once
    deposit.close(); // Close again, should not fail
    Assert.assertTrue(deposit.isClosed(), "Deposit should still be closed");
  }
}
