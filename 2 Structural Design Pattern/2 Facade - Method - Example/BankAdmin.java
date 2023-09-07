public class BankAdmin{
    Credit creditor=new Credit();
    Debit debitor=new Debit();
    FD fdIssuer=new FD();

    public void Onlinepayment(String fromAcc, String toAcc, Double amount,String name){
        debitor.debitAccount(fromAcc, amount,name);
        creditor.creditAccount(toAcc, amount,name);
        System.out.println(creditor);
        System.out.println(debitor);

    }
    public void AtmWithdraw(String fromAcc, Double amount,String name){
        debitor.debitAccount(fromAcc, amount,name);
    }
    public void getFD(String fromAcc, Double amount,String name,int rate){
        debitor.debitAccount(fromAcc, amount,name);
        fdIssuer.getFD(amount,name,rate);
        System.out.println(fdIssuer);
    }
}