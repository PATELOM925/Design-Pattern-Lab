public class CustomerPortal { private BankAdmin facade;
        public CustomerPortal(BankAdmin facade){
            this.facade=facade;
        }
        public static void main(String args[]){
            BankAdmin facade=new BankAdmin();
            System.out.println();
            facade.Onlinepayment("12423431","31431442",100.00,"OM");
            facade.AtmWithdraw("12421393",4200.00,"OM");
            facade.getFD("1002",55010.00,"OM",12);
        }
    }
    