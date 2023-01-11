package com.kodilla;

import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        long begin = System.currentTimeMillis();
        for (int i = 0; i < 5; i++) {
            Forecast forecast = new ForecastImplLazy();
            int number = new Random().nextInt(100);
            if (number < 20) {
                forecast.refreshData();
            }
            System.out.println(forecast.getWeather());
            System.out.println("Execution #" + i + " just finished");
        }
        long end = System.currentTimeMillis();
        System.out.println("The execution took: " + (end - begin) + " [ms]");
    }
}