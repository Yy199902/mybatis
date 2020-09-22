package com.example.mybatis.entity;


import lombok.Data;

import java.io.Serializable;

@Data
public class WeatherRequestEntity extends User implements Serializable {
    private final String appid = "73469397";
    private final String appsecret = "tBk3WOkC";
    private String cityid;
    private String city;
    private String ip;
    private String callback;
    private String vue;

}
