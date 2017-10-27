package com.avaya;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        WeatherReport nwr = new WeatherReport();
//
//        nwr.getWeather();
//        nwr.showWeather();


        WeatherForecast nwf = new WeatherForecast();

        nwf.getWeather();
        nwf.showWeather("letterkenny", "ie");

    }
}
