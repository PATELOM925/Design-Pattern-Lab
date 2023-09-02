public class SoundSystem extends CarFeature {
    public SoundSystem(Car car) {
        super(car);
    }
    @Override
    public String getDescription() {
        return car.getDescription() + "\n+ sound system";
    }
    @Override
    public double getPrice() {
        return car.getPrice() + 1000.0;
    }
}