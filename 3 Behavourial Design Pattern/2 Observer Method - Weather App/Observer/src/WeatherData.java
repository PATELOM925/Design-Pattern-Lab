import java.util.ArrayList;
import java.util.List;

class WeatherData {
    private List<WeatherDisplay> displays;
    private float temperature;
    private float humidity;
    private float pressure;
    public WeatherData() {
        displays = new ArrayList<>(); }

    public void addDisplay(WeatherDisplay display) {
        displays.add(display);}

    public void removeDisplay(WeatherDisplay display) {
        displays.remove(display); }

    public void updateWeather(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyDisplays();}
    private void notifyDisplays() {
        for (WeatherDisplay display : displays) {
            display.update(temperature, humidity, pressure); }}}