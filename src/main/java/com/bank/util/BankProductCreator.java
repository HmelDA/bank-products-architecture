package com.bank.util;

import com.bank.cards.Card;
import com.bank.cards.CreditCard;
import com.bank.cards.CurrencyDebitCard;
import com.bank.cards.DebitCard;
import com.bank.deposits.Deposit;
import com.bank.deposits.FixedDeposit;
import com.bank.deposits.RecurringDeposit;

public class BankProductCreator {

  public static Card createCard(String type, String currency, double balance, String name, double... additionalParams) {
    switch (type.toLowerCase()) {
      case "credit":
        if (additionalParams.length == 1) {
          return new CreditCard(currency, balance, name, additionalParams[0]);
        } else {
          throw new IllegalArgumentException("CreditCard requires an interest rate.");
        }
      case "debit":
        return new DebitCard(currency, balance, name);
      case "currency":
        return new CurrencyDebitCard(currency, balance, name);
      default:
        throw new IllegalArgumentException("Invalid card type: " + type);
    }
  }

  public static Deposit createDeposit(String type, String currency, double balance, String name) {
    switch (type.toLowerCase()) {
      case "fixed":
        return new FixedDeposit(currency, balance, name);
      case "recurring":
        return new RecurringDeposit(currency, balance, name);
      default:
        throw new IllegalArgumentException("Invalid deposit type: " + type);
    }
  }
}
