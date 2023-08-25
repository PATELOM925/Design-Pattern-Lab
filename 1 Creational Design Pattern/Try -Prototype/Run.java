package Prototype;
import java.util.List;

public class Run
{
    public static void main(String[] args)throws CloneNotSupportedException
    {
        Portal.Showcase();

        StartupIndia s1 = (StartupIndia) Portal.getStartup("1");
        System.out.println("Startup India Consists of :  " + s1.getSector() + "\n"+s1.getseedfund());
        StartupIndia s2 = (StartupIndia) Portal.getStartup("2");
        System.out.println("Startup India Consists of :  " + s2.getSector()+ "\n"+ s2.getseedfund());
        StartupIndia s3 = (StartupIndia) Portal.getStartup("3");
        System.out.println("Startup India Consists of :  " + s3.getSector() + "\n" + s3.getseedfund());
    }
}
