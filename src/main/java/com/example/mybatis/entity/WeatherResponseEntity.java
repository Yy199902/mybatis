package com.example.mybatis.entity;


import lombok.Data;

@Data
public class WeatherResponseEntity {
    private String cityid;
    private String city;
    private String update_time;
    private String wea;
    private String wea_img;
    private String tem;
    private String tem_day;
    private String tem_night;
    private String win;
    private String win_speed;
    private String win_meter;
    private String air;

}
