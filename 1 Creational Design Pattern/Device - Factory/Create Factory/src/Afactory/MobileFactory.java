package Afactory;

public class MobileFactory extends AbstractDeviceFactory{
    public Device getGadget(DeviceType deviceType){
        switch(deviceType)
        {
            case Iphone:return new Iphone("8gb","A14 bionic");
            case Samsung:return new Samsung("4gb","Snapdragon 888");
        }
        return null;
    }
}
