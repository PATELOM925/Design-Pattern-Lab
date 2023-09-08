class WatchDisplay implements WeatherDisplay {
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("Watch Display: " + temperature + "F degrees and " + pressure + " pressure atm \n");
    }
}