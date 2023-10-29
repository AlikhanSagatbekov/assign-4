class WeatherDataFactory {
    public static WeatherData createWeatherData(double temperature, double humidity, double pressure) {
        return new WeatherData(temperature, humidity, pressure);
    }
}