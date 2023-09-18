public class OverdrawnState implements AccountState {
    private Account account;

    public OverdrawnState(Account account) {
        this.account = account;
    }

    @Override
    public void deposit(double amount) {
        account.setBalance(account.getBalance() + amount);
        if (account.getBalance() > 0) {
            account.setState(new ActiveState(account));
            System.out.println("Account is now active.");
        }
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Account is overdrawn. Please deposit funds to cover the negative balance.");
    }

    @Override
    public void checkBalance() {}
}