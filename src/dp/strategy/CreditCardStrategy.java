package dp.strategy;

import dp.strategy.structure.PaymentStrategy;

public class CreditCardStrategy implements PaymentStrategy {
    private String cardNumber;

    public CreditCardStrategy(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with credit card with this number (please dont do this in prod... " + cardNumber);
    }
}