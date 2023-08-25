package Ofactory;

public class Paytm extends Payment{
    private String upiID;
    private String Name;

    public Paytm(String upiID, String Name){
        this.upiID=upiID;
        this.Name = Name;
    }

    public String getDetails(){
        return "Pay using Paytm where, Upi ID = "+this.upiID+" \n Name = "+this.Name;
    }

    public String toString(){
        return "PhonePe where UPI ID: " +upiID+" Acc.Holder: "+Name;
    }
}
