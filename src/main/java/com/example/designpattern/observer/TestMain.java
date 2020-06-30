package com.example.designpattern.observer;


import com.example.designpattern.observer.jdkpattern.CurrentConditionDisplay;
import com.example.designpattern.observer.jdkpattern.OtherConditionDisplay;
import com.example.designpattern.observer.jdkpattern.WeatherDate;


/**
 * @author liuguobin
 * @Title: TestMain
 * @ProjectName spring-boot-mybatisplus-3.1.x
 * @Description: TODO
 * @date 2020/6/28 11:22 AM
 */
public class TestMain {

    public static void main(String[] args) {
        WeatherDate weatherDate = new WeatherDate();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherDate);
        OtherConditionDisplay conditionDisplay = new OtherConditionDisplay(weatherDate);
        weatherDate.setMeasurements(11f,33f,33f);
    }

}
