package composite;

public class leaf implements CarDesign {
    int Price;
    String Name;
    String TimeDuration;

    // Constructor
    public leaf(int Price, String Name, String TimeDuration) {
        this.Price = Price;
        this.Name = Name;
        this.TimeDuration = TimeDuration;
    }

    @Override
    public void showPrice() {
        System.out.println(Name + " : " + Price + ", Time : " + TimeDuration);
    }
}
