public abstract class CarFeature implements Car {
    protected Car car;
    public CarFeature(Car car) {
        this.car = car;
    }
    @Override
    public String getDescription() {
        return car.getDescription();
    }
    @Override
    public double getPrice() {
        return car.getPrice();
    }
}
