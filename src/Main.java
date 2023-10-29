public class Main {
    public static void main(String[] args) {
        // Create a weather station
        WeatherStation weatherStation = new WeatherStation();

        // Create observers (displays)
        Display display1 = new Display();
        Display display2 = new Display();

        // Add observers to the weather station
        weatherStation.addObserver(display1);
        weatherStation.addObserver(display2);

        // Simulate weather changes
        WeatherData weatherData1 = WeatherDataFactory.createWeatherData(25, 60, 1013);
        WeatherData weatherData2 = WeatherDataFactory.createWeatherData(27, 55, 1010);

        // Notify observers about the weather changes
        weatherStation.notifyObservers(weatherData1);
        weatherStation.notifyObservers(weatherData2);
    }
}