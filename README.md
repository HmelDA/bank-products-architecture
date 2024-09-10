# bank-products-architecture
Architecture and unit tests for banking products
bank-products-architecture/
│
├── .gitignore
├── pom.xml
├── README.md
├── src
│   ├── main
│   │   └── java
│   │       └── com
│   │           └── bank
│   │               ├── BankProduct.java       // Интерфейс для всех продуктов
│   │               ├── Card.java              // Абстрактный класс для карт
│   │               ├── CreditCard.java        // Класс для кредитной карты
│   │               ├── DebitCard.java         // Класс для дебетовой карты
│   │               ├── CurrencyDebitCard.java // Класс для валютной дебетовой карты
│   │               ├── Deposit.java           // Абстрактный класс для депозитов
│   │               ├── FixedDeposit.java      // Класс для фиксированного вклада
│   │               ├── RecurringDeposit.java  // Класс для пополняемого вклада
│   │               ├── BankProductCreator.java // Фабрика для создания продуктов
│   │               └── BankApplication.java   // Главный класс для демонстрации
│   
│   └── test
│       └── java
│           └── com
│               └── bank
│                   ├── CreditCardTest.java    // Юнит-тесты для кредитной карты
│                   ├── DebitCardTest.java     // Юнит-тесты для дебетовой карты
│                   ├── CurrencyDebitCardTest.java // Юнит-тесты для валютной дебетовой карты
│                   ├── FixedDepositTest.java  // Юнит-тесты для фиксированного вклада
│                   ├── RecurringDepositTest.java // Юнит-тесты для пополняемого вклада
│                   └── BankApplicationTest.java // Тесты для всей системы
