package composite;

import java.awt.*;
public class Portal
{
    public static void main(String[] args)
    {
        CarDesign leather = new leaf(24500,"Leather","75 hrs");
        CarDesign Cotton = new leaf(13500,"Cotton","39 hrs");
        CarDesign WheelSize = new leaf(34000,"WheelSize","35 hrs");
        CarDesign AlloyColor = new leaf(23000,"Alloys","55 hrs");
        CarDesign Paint = new leaf(86000,"Car Paint","153 hrs");
        CarDesign Accessories = new leaf(230000,"Accessories", "280 hrs");

        Composite CarDesign = new Composite("Car Design");
        Composite Interior = new Composite("Interior");
        Composite Exterior = new Composite("Exterior");
        Composite SeatCover = new Composite("SeatCover");
        Composite Wheels = new Composite("Wheels");

        CarDesign.addComponent(Interior);
        CarDesign.addComponent(Exterior);

        Interior.addComponent(SeatCover);
        Interior.addComponent(Accessories);
        Exterior.addComponent(Wheels);
        Exterior.addComponent(Paint);

        Wheels.addComponent(WheelSize);
        Wheels.addComponent(AlloyColor);
        SeatCover.addComponent(leather);
        SeatCover.addComponent(Cotton);

        CarDesign.showPrice();
    }
}