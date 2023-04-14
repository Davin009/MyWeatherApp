package com.weatherApp.model;

import lombok.*;

@Getter
@Setter
public class WeatherAirQuality {
private double co;
private double no2;
private double o3;
private double so2;
private double pm2_5;
private double  pm10;
private int us_epa_index;
private int gb_defra_index;

}
