package com.weatherApp.model;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Timestamp;

@Getter
@Setter
    public class LocationData {
        private String name;
        private String region;
        private String country;
        private double  lat;
        private double  lon;
        private String tz_id;
        private long localtime_epoch;
        private String localtime;

}
