package com.bank.cards;

public class CurrencyDebitCard extends Card {

  private String currency;

  public CurrencyDebitCard(String currency, double balance, String name) {
    super(currency, balance, name);
    this.currency = currency;
  }

  @Override
  public String getCurrency() {
    return currency;
  }
}
