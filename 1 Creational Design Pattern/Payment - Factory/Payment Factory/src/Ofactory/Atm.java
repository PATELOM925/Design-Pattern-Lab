package Ofactory;

public class Atm extends Payment {
    private String CardNo;
    private String CVV;
    private String Name;

    public Atm(String CardNo,String CVV, String Name){
        this.CardNo=CardNo;
        this.CVV=CVV;
        this.Name=Name;
    }

    public String getDetails(){
        return "Insert & get cash from ATM ,\n Card Number = "+this.CardNo+" \n CVV Number = "+this.CVV+" \n Name "+this.Name;
    }

    public String toString(){
        return "Atm  Card Number: " +CardNo+" CVV Number: "+CVV+" Name: "+Name;
    }
}