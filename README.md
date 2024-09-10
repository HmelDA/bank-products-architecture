# bank-products-architecture
Architecture and unit tests for banking products
bank-products-architecture/
│
├── .gitignore               # Git ignore file
├── pom.xml                  # Maven configuration file
├── README.md                # Git ignore file
├── src
│   ├── main
│   │   └── java
│   │       └── com
│   │           └── bank
│   │               ├── base
│   │               │   └── BankProduct.java        # Interface for all products
│   │               ├── cards
│   │               │   ├── Card.java               # Abstract class for cards
│   │               │   ├── CreditCard.java         # Class for credit card
│   │               │   ├── DebitCard.java          # Class for debit card
│   │               │   └── CurrencyDebitCard.java  # Class for currency debit card
│   │               ├── deposits
│   │               │   ├── Deposit.java            # Abstract class for deposits
│   │               │   ├── FixedDeposit.java       # Class for fixed deposit
│   │               │   └── RecurringDeposit.java   # Class for recurring deposit
│   │               ├── util
│   │               │   └── BankProductCreator.java # Factory for creating products
│   │               └── BankApplication.java        # Main class for demonstration
│   
│   └── test
│       └── java
│           └── com
│               └── bank
│                   ├── cards
│                   │   ├── CreditCardTest.java        # Unit tests for credit card
│                   │   ├── DebitCardTest.java         # Unit tests for debit card
│                   │   └── CurrencyDebitCardTest.java # Unit tests for currency debit card
│                   ├── deposits
│                   │   ├── FixedDepositTest.java      # Unit tests for fixed deposit
│                   │   └── RecurringDepositTest.java  # Unit tests for recurring deposit
│                   └── BankApplicationTest.java       # Tests for the entire system
