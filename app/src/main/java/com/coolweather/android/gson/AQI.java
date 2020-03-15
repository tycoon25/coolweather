package com.coolweather.android.gson;

/**
 * Created by HSJ91 on 2020/3/14.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
