public class Main {
    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9101-1121");
        PaymentStrategy payPalPayment = new PayPalPayment("rasul@gmail.com");

        cart.setPaymentStrategy(creditCardPayment);
        cart.checkout(100);

        cart.setPaymentStrategy(payPalPayment);
        cart.checkout(50);
    }
}