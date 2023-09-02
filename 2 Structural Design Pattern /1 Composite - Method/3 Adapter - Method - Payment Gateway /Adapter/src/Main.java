public class Main {
    public static void main(String[] args) {
        PaymentGateway paytm = new Paytm();
        PaymentGateway razorPay = new RazorPayAdapter(new RazorPay());

        paytm.processPayment("Paytm", 1001.0);
        razorPay.processPayment("RazorPay ", 1000.0);
    }
}
