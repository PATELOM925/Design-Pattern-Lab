package Prototype;
import java.util.List;
public class PrototypePatternExample
{
    public static void main(String[] args)throws CloneNotSupportedException
    {
        // TODO Auto-generated method stub
        Vehicle a=new Vehicle();
        a.insertData();

        Vehicle b=(Vehicle) a.clone();
        System.out.println("A"+a.getVehiclelist());
        System.out.println("B"+b.getVehiclelist());
        List <String> list=b.getVehiclelist();
        list.add("Honda New Amaze");
        System.out.println("B"+b.getVehiclelist());

        b.getVehiclelist().remove("Audi A4");
        System.out.println("B"+list);
        System.out.println("A"+a.getVehiclelist());
        b.modify();
    }
}
