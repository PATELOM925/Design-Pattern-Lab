public class ActiveState implements AccountState {
    private Account account;

    public ActiveState(Account account) {
        this.account = account;
    }

    @Override
    public void deposit(double amount) {
        account.setBalance(account.getBalance() + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (account.getBalance() - amount >= 0) {
            account.setBalance(account.getBalance() - amount);
        } else {
            account.setState(new OverdrawnState(account));
            System.out.println("Account is now overdrawn.");
        }
    }

    @Override
    public void checkBalance() {}
}