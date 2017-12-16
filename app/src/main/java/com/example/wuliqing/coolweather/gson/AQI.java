package com.example.wuliqing.coolweather.gson;

/**
 * Created by wuliqing on 2017/12/16.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
