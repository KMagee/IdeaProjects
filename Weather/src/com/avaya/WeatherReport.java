package com.avaya;

public class WeatherReport implements IWeather{

    public String city = "Galway";
    public String country = "IE";



    @Override
    public void getWeather() {

        System.out.println("Contacting weather server...");

    }

    @Override
    public void showWeather() {
//Inside showWeather() say something like "cloudy, 9 degrees" concatenated with the city and country values

        System.out.println("City: " + city + "\n" + "Country: " + country + "\n" + "Current Weather: Cloudy, 9 degrees");
    }
}


