package Afactory;

public class LaptopFactory extends AbstractDeviceFactory{
    public Device getGadget(DeviceType deviceType){
        switch(deviceType)
        {
            case HP:
                return new HP("16gb","Intel","AMD Radeon RX 6650");
            case Dell:
                return new Dell("8gb","AMD,","Nvidia");
        }
        return null;
    }
}
