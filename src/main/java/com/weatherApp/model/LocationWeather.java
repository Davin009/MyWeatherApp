package com.weatherApp.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LocationWeather {
    @JsonAlias("location")
    private LocationData locationData;
    @JsonAlias("current")
    private CurrentLocation currentLocation;
}
