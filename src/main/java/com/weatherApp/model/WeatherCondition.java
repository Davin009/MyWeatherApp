package com.weatherApp.model;
import lombok.*;

@Getter
@Setter
public class WeatherCondition {
    private String text;
    private String icon;
    private int code;
}
