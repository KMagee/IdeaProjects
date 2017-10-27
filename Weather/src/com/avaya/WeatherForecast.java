package com.avaya;

public class WeatherForecast extends WeatherReport implements IWeather {
    String forecastPrediction = "Predicts";

    public void getWeather(){
        System.out.println(forecastPrediction);
        super.getWeather();

    };


    public void showWeather(String city, String country){
        System.out.println(forecastPrediction);
        this.city = city;
        this.country = country;
        super.showWeather();

    };





}


