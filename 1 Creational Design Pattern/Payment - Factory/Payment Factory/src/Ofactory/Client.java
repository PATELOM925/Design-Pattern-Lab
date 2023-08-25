package Ofactory;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Your Payment Mode");
        System.out.println(" (1) Cash \n (2) Online");
        int choice = in.nextInt();

        if (choice == 1) {
            Payment atm = FactoryGenerator.getFactory(FactoryType.CashFactory).getGadget(PaymentType.Atm);
            System.out.println(atm.getDetails());
            System.out.println(" \n ");
            Payment BW = FactoryGenerator.getFactory(FactoryType.CashFactory).getGadget(PaymentType.BankWithdraw);
            System.out.println(BW.getDetails());
        } else if (choice == 2) {
            Payment Phonepe = FactoryGenerator.getFactory(FactoryType.OnlineFactory).getGadget(PaymentType.PhonePe);
            System.out.println(Phonepe.getDetails());
            Payment Paytm = FactoryGenerator.getFactory(FactoryType.OnlineFactory).getGadget(PaymentType.Paytm);
            System.out.println(Paytm.getDetails());
        }
        else
            System.out.println("Invalid Payment Mode , Choose from given number only!!");

    }
}

