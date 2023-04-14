package com.weatherApp.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.*;

@Data
@Setter
@Getter
public class CurrentLocation {
    private long last_updated_epoch;
    private String last_updated;
    private double temp_c;
    private double temp_f;
    private int is_day;
    @JsonAlias("condition")
    private WeatherCondition weatherCondition;
    private double wind_mph;
    private double wind_kph;
    private int wind_degree;
    private String wind_dir;
    private double pressure_mb;
    private double pressure_in;
    private double precip_mm;
    private double precip_in;
    private int humidity;
    private int cloud;
    private double feelslike_c;
    private double feelslike_f;
    private double vis_km;
    private double vis_miles;
    private double uv;
    private double gust_mph;
    private double gust_kph;
    @JsonAlias("air_quality")
    private WeatherAirQuality weatherAirQuality;
}
