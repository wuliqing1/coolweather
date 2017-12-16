package com.example.wuliqing.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by wuliqing on 2017/12/16.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
