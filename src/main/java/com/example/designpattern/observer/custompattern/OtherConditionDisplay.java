package com.example.designpattern.observer.custompattern;

/**
 * @author liuguobin
 * @Title: CurrentConditionDisplay
 * @ProjectName spring-boot-mybatisplus-3.1.x
 * @Description: TODO
 * @date 2020/6/28 10:38 AM
 */
public class OtherConditionDisplay implements Observer,DisplayMent {

    private float temp;
    private float humidity;
    private float pressure;

    private WeatherDate weatherDate;

    public OtherConditionDisplay(WeatherDate weatherDate) {
        this.weatherDate = weatherDate;
        weatherDate.registerObserver(this);
        weatherDate.removerObserver(this);
    }

    /**
     * 展示
     */
    @Override
    public void display() {
        System.out.println("修改了的天气情况: 湿度：" + humidity + "，温度：" + temp + "：压力：" + pressure );
    }

    /**
     * 更新
     * @param temp
     * @param humidity
     * @param pressure
     */
    @Override
    public void update(float temp, float humidity, float pressure) {
        this.humidity = humidity;
        this.pressure = pressure;
        this.temp = temp;
        display();
    }
}
