package com.weatherApp.repository;

import org.springframework.stereotype.Repository;

@Repository
public interface WeatherApi {
    Object getWeatherData(String place);
}
