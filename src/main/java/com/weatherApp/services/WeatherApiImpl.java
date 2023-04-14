package com.weatherApp.services;

import com.weatherApp.model.LocationWeather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class WeatherApiImpl implements WeatherApi {
    private final String key;

    @Autowired
    public WeatherApiImpl(@Value("${process.env.API_KEY}") String key) {
        this.key = key;
    }
    @Override
    public Object getWeatherData(String place) {
        String uri = "https://api.weatherapi.com/v1/current.json?key="+key+"&q="+place+"&aqi=yes";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(uri, LocationWeather.class);
    }
}
