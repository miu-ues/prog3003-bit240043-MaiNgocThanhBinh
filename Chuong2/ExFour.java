package Chapter04;

public class ExFour {
     interface PaymentStrategy {
        void pay(int amount);
    }

    static class CreditCardPayment implements PaymentStrategy {
        public void pay(int amount) {
            System.out.println("Paid " + amount + " using Credit Card");
        }
    }

    static class PayPalPayment implements PaymentStrategy {
        public void pay(int amount) {
            System.out.println("Paid " + amount + " using PayPal");
        }
    }

    static class ShoppingCart {

        private PaymentStrategy strategy;

        public void setPaymentStrategy(PaymentStrategy strategy) {
            this.strategy = strategy;
        }

        public void checkout(int amount) {
            strategy.pay(amount);
        }
    }

    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        cart.setPaymentStrategy(new CreditCardPayment());
        cart.checkout(500);

        cart.setPaymentStrategy(new PayPalPayment());
        cart.checkout(300);
    }
}
