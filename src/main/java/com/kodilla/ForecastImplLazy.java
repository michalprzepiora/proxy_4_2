package com.kodilla;

public class ForecastImplLazy implements Forecast {
    private static final String WEATHER_FORECAST = "During the day the highest temperature -6 °C. " +
            "Total rainfall 0 mm. At night overcast. The lowest temperature -8 °C. Total rainfall 0.2 mm.";
    private static Forecast forecast;

    @Override
    public String getWeather() throws InterruptedException {
        return WEATHER_FORECAST;
    }

    @Override
    public void refreshData() throws InterruptedException {
        if (forecast == null) {
            forecast = new ForecastImpl();
        }
        forecast.refreshData();
    }
}
