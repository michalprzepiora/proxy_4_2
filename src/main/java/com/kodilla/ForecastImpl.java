package com.kodilla;

public class ForecastImpl implements Forecast{
    private static final String WEATHER_FORECAST = "During the day the highest temperature -6 °C. " +
            "Total rainfall 0 mm. At night overcast. The lowest temperature -8 °C. Total rainfall 0.2 mm.";
    private String message = "Not uploaded yet.";

    public ForecastImpl() throws InterruptedException {
        refreshData();
    }

    public String getWeather() {
        return message;
    }

    public void refreshData() throws InterruptedException {
        System.out.print("Start update weather");
        Thread.sleep(5000);
        message = WEATHER_FORECAST;
        System.out.println("....DONE");
    }
}
