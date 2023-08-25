package Ofactory;

public class BankWithdraw extends Payment{
    private String AccNo;
    private String IFSC;
    private String Name;

    public BankWithdraw(String AccNo,String IFSCcode, String Name){
        this.AccNo=AccNo;
        this.IFSC=IFSCcode;
        this.Name=Name;
    }

    public String getDetails(){
        return "Bank withdrawal Details,\n Account Number = "+this.AccNo+" \n IFSC Code = "+this.IFSC+" \n Name "+this.Name;
    }

    public String toString(){
        return "Bank Withdrawal AccNo: " +AccNo+" IFSC code: "+IFSC+" Name: "+Name;
    }
}


