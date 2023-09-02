public class Paytm implements PaymentGateway {
    @Override
    public void processPayment(String paymentType, double amount) {
        System.out.println("Sending payment of " + amount + " through "+ paymentType);
    }
}