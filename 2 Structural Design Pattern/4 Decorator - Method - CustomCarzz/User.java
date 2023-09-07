public class User {
    public static void main(String[] args) {
        Car car = new BaseCar();
        car = new GPS(car);
        car = new SoundSystem(car);
        car = new LeatherSeats(car);
        System.out.println(car.getDescription() + "\n costs $" + car.getPrice());
    }
}