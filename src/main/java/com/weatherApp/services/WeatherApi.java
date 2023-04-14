package com.weatherApp.services;

import org.springframework.stereotype.Repository;

@Repository
public interface WeatherApi {
    Object getWeatherData(String place);
}
