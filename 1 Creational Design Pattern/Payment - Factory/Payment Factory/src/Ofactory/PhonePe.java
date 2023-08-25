package Ofactory;

public class PhonePe extends Payment{
    private String upiID;
    private String Name;

    public PhonePe(String upiID, String Name){
        this.upiID=upiID;
        this.Name = Name;
    }

    public String getDetails(){
        return "Pay using PhonePe where, Upi ID = "+this.upiID+" \n Name = "+this.Name;
    }

    public String toString(){
        return "PhonePe where UPI ID: " +upiID+" Name: "+Name;
    }
}

