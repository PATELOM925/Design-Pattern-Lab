// Concrete component - Base Car
public class BaseCar implements Car {
    @Override
    public String getDescription() {
        return "Base car";
    }

    @Override
    public double getPrice() {
        return 10000.0;
    }
}
