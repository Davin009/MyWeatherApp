package com.weatherApp.controller;

import com.weatherApp.repository.WeatherApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ApiController {

    @Autowired
    WeatherApi weatherApi;

    @GetMapping("/data")
    private Object getWeather(@RequestParam String place) {
        return weatherApi.getWeatherData(place);
    }
}
