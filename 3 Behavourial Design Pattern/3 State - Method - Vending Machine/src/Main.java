public class Main {
    public static void main(String[] args) {
        Account account = new Account();

        account.checkBalance();
        account.deposit(1000.0);
        account.checkBalance();
        account.withdraw(500.0);
        account.checkBalance();
        account.withdraw(600.0);
        account.checkBalance();
        account.deposit(200.0);
        account.checkBalance();
        account.withdraw(150.0);
        account.checkBalance();
        account.deposit(100.0);
        account.checkBalance();
    }
}