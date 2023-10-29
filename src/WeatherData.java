class WeatherData {
    private double temperature;
    private double humidity;
    private double pressure;

    public WeatherData(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    @Override
    public String toString() {
        return "Temperature: " + temperature + ", Humidity: " + humidity + ", Pressure: " + pressure;
    }
}