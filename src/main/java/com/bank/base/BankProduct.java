package com.bank.base;

public interface BankProduct {

  String getCurrency();

  double getBalance();

  String getName();

  void deposit(double amount);

  void withdraw(double amount);
}
