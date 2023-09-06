package composite;


import java.util.ArrayList;
import java.util.List;

public class Composite implements CarDesign {
    String Name;
    List<CarDesign> components = new ArrayList<CarDesign>();

    // Constructor
    public Composite(String Name) {
        this.Name = Name;
    }


    public void addComponent(CarDesign cd) {
        components.add(cd);
    }

    @Override
    public void showPrice() {
        System.out.println(Name);
        for (CarDesign c : components) {
            c.showPrice();
        }
    }
}