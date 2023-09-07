public class LeatherSeats extends CarFeature {
    public LeatherSeats(Car car) {
        super(car);
    }
    @Override
    public String getDescription() {
        return car.getDescription() + "\n+ leather seats";
    }
    @Override
    public double getPrice() {
        return car.getPrice() + 1500.0;
    }
}