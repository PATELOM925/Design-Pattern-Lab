public interface PaymentGateway {
    void processPayment(String paymentType, double amount);
}