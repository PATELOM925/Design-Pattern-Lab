package Ofactory;

public class CashFactory extends AbstractPayFactory{
    public Payment getGadget(PaymentType paymentType){
        switch(paymentType)
        {
            case Atm:
                return new Atm("1234567890098765","23/9","Nikhil ");
            case BankWithdraw:
                return new BankWithdraw("10982736459","BAROD101,","Nitin");
        }
        return null;
    }
}
