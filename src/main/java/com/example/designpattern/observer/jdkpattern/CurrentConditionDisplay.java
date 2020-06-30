package com.example.designpattern.observer.jdkpattern;

import com.example.designpattern.observer.custompattern.DisplayMent;

import java.util.Observable;
import java.util.Observer;

/**
 * @author liuguobin
 * @Title: CurrentConditionDisplay
 * @ProjectName spring-boot-mybatisplus-3.1.x
 * @Description: TODO
 * @date 2020/6/28 10:38 AM
 */
public class CurrentConditionDisplay implements Observer,DisplayMent {

    private float temp;
    private float humidity;
    private float pressure;

    private Observable observable;

    public CurrentConditionDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    /**
     * 展示
     */
    @Override
    public void display() {
        System.out.println("现在天气情况: 湿度：" + humidity + "，温度：" + temp + "：压力：" + pressure );
    }

    @Override
    public void update(Observable o, Object arg) {

        if (o instanceof WeatherDate) {
            WeatherDate weatherDate = (WeatherDate) o;
            this.humidity = weatherDate.getHumidity();
            this.pressure = weatherDate.getPressure();
            this.temp = weatherDate.getTemp();
            display();
        }
    }
}
