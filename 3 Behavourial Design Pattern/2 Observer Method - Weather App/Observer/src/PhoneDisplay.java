class PhoneDisplay implements WeatherDisplay {
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("Phone Display: " + temperature + "F degrees and " + humidity + "% humidity");
    }
}