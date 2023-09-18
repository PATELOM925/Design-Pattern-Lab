public class Account {
    private AccountState state;
    private double balance;

    public Account() {
        this.state = new ActiveState(this);
        this.balance = 0.0;
    }

    public void setState(AccountState state) {
        this.state = state;
    }

    public void deposit(double amount) {
        state.deposit(amount);
        System.out.println("Deposited " + amount + " to account. New balance: " + balance);
    }

    public void withdraw(double amount) {
        state.withdraw(amount);
        System.out.println("Withdrew " + amount + " from account. New balance: " + balance);
    }

    public void checkBalance() {
        state.checkBalance();
        System.out.println("Current balance: " + balance);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
