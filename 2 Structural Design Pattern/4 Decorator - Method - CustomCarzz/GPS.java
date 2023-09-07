public class GPS extends CarFeature {
    public GPS(Car car) {
        super(car);
    }
    @Override
    public String getDescription() {
        return car.getDescription() + "\n+ GPS";
    }
    @Override
    public double getPrice() {
        return car.getPrice() + 500.0;
    }
}