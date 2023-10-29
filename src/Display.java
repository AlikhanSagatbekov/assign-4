class Display implements Observer {
    @Override
    public void update(WeatherData weatherData) {
        System.out.println("Display: " + weatherData);
    }
}