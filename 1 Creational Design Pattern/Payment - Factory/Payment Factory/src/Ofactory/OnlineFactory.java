package Ofactory;

public class OnlineFactory extends AbstractPayFactory{
    public Payment getGadget(PaymentType paymentType){
        switch(paymentType)
        {
            case PhonePe:return new PhonePe("0987654321@phonepe"," samir nigam");
            case Paytm:return new Paytm("1234567890@paytm","vijay shekhar");
        }
        return null;
    }
}
