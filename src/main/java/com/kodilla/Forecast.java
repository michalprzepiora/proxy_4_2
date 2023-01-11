package com.kodilla;

public interface Forecast {
    public String getWeather() throws InterruptedException;
    public void refreshData() throws InterruptedException;
}
