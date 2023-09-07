public class RazorPayAdapter implements PaymentGateway {
    private RazorPay rp;

    public RazorPayAdapter(RazorPay rp) {
        this.rp = rp;
    }

    @Override
    public void processPayment(String paymentType, double amount) {
        rp.initiatePayment(paymentType, amount);
    }
}