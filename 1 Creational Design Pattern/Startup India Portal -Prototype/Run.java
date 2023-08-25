package Prototype;
import java.util.List;
import java.util.Scanner;

public class Run
{
    public static void main(String[] args)
            throws CloneNotSupportedException
    {
        Portal.Showcase();
        Scanner in = new Scanner(System.in);
        System.out.println("To get info about " +
                "Startup India \n Input : 1 for " +
                "Tech \n 2 for Energy \n 3 for Pharma");
        int a = in.nextInt();

        StartupIndia s1 = (StartupIndia) Portal.
                getStartup(String.valueOf(a));
        System.out.println(s1.getseedfund() +
                "Startup India Consists of "
                + s1.getSector() +" Startups" + "\n" );
    }
}
