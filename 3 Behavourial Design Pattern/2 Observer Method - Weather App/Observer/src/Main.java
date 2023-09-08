public class Main {
    public static void main(String[] args) {
        WeatherData weatherStation = new WeatherData();

        // Add some displays to the weather station
        PhoneDisplay phoneDisplay = new PhoneDisplay();
        TVDisplay tvDisplay = new TVDisplay();
        WatchDisplay wd = new WatchDisplay();
        weatherStation.addDisplay(phoneDisplay);
        weatherStation.addDisplay(tvDisplay);
        weatherStation.addDisplay(wd);


        weatherStation.updateWeather(96.9f, 30.1f, 4.4f);
        weatherStation.updateWeather(60.5f, 42.3f, 19.2f);

        // Remove a display from the weather station
        weatherStation.removeDisplay(phoneDisplay);

        // Simulate some more weather updates
        weatherStation.updateWeather(71.6f, 29.8f, 23.4f);
    }
}