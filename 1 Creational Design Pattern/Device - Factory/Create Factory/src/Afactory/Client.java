package Afactory;

public class Client {
    public static void main(String[] args) {
        Device dell = FactoryGenerator.getFactory(FactoryType.LaptopFactory).getGadget(DeviceType.Dell);
        System.out.println(dell.getDetails());
        Device iphone = FactoryGenerator.getFactory(FactoryType.MobileFactory).getGadget(DeviceType.Iphone);
        System.out.println(iphone.getDetails());

    }
}
