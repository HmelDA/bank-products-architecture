package com.bank.cards;

import com.bank.base.BankProduct;

public abstract class Card implements BankProduct {

  private String currency;
  private double balance;
  private String name;

  public Card(String currency, double balance, String name) {
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
    if (amount <= balance) {
      balance -= amount;
    } else {
      throw new IllegalArgumentException("Insufficient balance");
    }
  }
}
