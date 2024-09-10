package com.bank.deposits;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FixedDepositTest {

  // Positive test cases

  @Test(groups = "positive")
  public void testFixedDepositCreation() {
    FixedDeposit deposit = new FixedDeposit("USD", 1000.0, "John Doe");
    Assert.assertEquals(deposit.getBalance(), 1000.0, "Initial balance should be 1000");
    Assert.assertEquals(deposit.getCurrency(), "USD", "Currency should be USD");
    Assert.assertFalse(deposit.isClosed(), "Deposit should not be closed initially");
  }

  @Test(groups = "positive")
  public void testFixedDepositClose() {
    FixedDeposit deposit = new FixedDeposit("USD", 1000.0, "John Doe");
    deposit.close();
    Assert.assertTrue(deposit.isClosed(), "Deposit should be closed after calling close()");
  }

  @Test(groups = "positive")
  public void testFixedDepositDoubleClose() {
    FixedDeposit deposit = new FixedDeposit("USD", 1000.0, "John Doe");
    deposit.close();
    deposit.close(); // Closing a second time
    Assert.assertTrue(deposit.isClosed(), "Deposit should still be closed after a second close()");
  }

  @Test(groups = "positive")
  public void testFixedDepositCurrencyAndBalance() {
    FixedDeposit deposit = new FixedDeposit("EUR", 500.0, "Jane Doe");
    Assert.assertEquals(deposit.getBalance(), 500.0, "Balance should be 500");
    Assert.assertEquals(deposit.getCurrency(), "EUR", "Currency should be EUR");
  }

  // Negative test cases


  @Test(groups = "negative")
  public void testFixedDepositZeroBalance() {
    FixedDeposit deposit = new FixedDeposit("USD", 0.0, "John Doe");
    Assert.assertEquals(deposit.getBalance(), 0.0, "Balance should be 0");
    Assert.assertFalse(deposit.isClosed(), "Deposit should not be closed initially");
  }

  @Test(groups = "negative")
  public void testFixedDepositCloseWithoutChange() {
    FixedDeposit deposit = new FixedDeposit("USD", 1000.0, "John Doe");
    deposit.close(); // Close once
    deposit.close(); // Close again, should not fail
    Assert.assertTrue(deposit.isClosed(), "Deposit should still be closed");
  }
}