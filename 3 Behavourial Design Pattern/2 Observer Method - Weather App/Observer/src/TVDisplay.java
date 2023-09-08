class TVDisplay implements WeatherDisplay {
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("TV Display: " + temperature + "F degrees and " + pressure + " pressure atm");
    }
}