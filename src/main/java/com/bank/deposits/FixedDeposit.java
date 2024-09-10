package com.bank.deposits;

public class FixedDeposit extends Deposit {

  private boolean isClosed;

  public FixedDeposit(String currency, double balance, String name) {
    super(currency, balance, name);
    this.isClosed = false;
  }

  @Override
  public void close() {
    if (!isClosed) {
      isClosed = true;
    }
  }

  public boolean isClosed() {
    return isClosed;
  }
}
