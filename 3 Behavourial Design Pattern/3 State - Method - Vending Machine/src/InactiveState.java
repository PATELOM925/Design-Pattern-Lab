public class InactiveState implements AccountState {
    @Override
    public void deposit(double amount) {}

    @Override
    public void withdraw(double amount) {}

    @Override
    public void checkBalance() {
        System.out.println("Account is inactive. Please contact customer support to reactivate.");
    }
}