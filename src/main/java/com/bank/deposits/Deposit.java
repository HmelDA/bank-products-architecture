package com.bank.deposits;

import com.bank.base.BankProduct;

public abstract class Deposit implements BankProduct {

  private String currency;
  private double balance;
  private String name;

  public Deposit(String currency, double balance, String name) {
    this.currency = currency;
    this.balance = balance;
    this.name = name;
  }

  @Override
  public String getCurrency() {
    return currency;
  }

  @Override
  public double getBalance() {
    return balance;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public void deposit(double amount) {
    balance += amount;
  }

  @Override
  public void withdraw(double amount) {
    throw new UnsupportedOperationException("Withdrawals are not supported for this deposit type");
  }

  public abstract void close();
}
