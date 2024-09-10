package com.bank.cards;

public class CreditCard extends Card {

  private double interestRate;  // Процентная ставка

  public CreditCard(String currency, double balance, String name, double interestRate) {
    super(currency, balance, name);
    this.interestRate = interestRate;
  }

  public double getInterestRate() {
    return interestRate;
  }

  public void setInterestRate(double interestRate) {
    this.interestRate = interestRate;
  }

  public double getDebt() {
    // Для примера, мы просто вернем баланс. Можно расширить логику.
    return getBalance();
  }
}
