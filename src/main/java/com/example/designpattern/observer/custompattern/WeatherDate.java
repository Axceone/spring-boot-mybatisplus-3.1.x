package com.example.designpattern.observer.custompattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuguobin
 * @Title: WeatherDate
 * @ProjectName spring-boot-mybatisplus-3.1.x
 * @Description: 天气
 * @date 2020/6/28 10:20 AM
 */
public class WeatherDate implements Subject {

    private float temp;
    private float humidity;
    private float pressure;

    List<Observer> observers;

    public WeatherDate() {
        //用的时候再初始化
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removerObserver(Observer observer) {
        int i = observers.indexOf(observer);
        observers.remove(i);
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = observers.get(i);
            //通知观察者做出改变
            observer.update(temp,humidity,pressure);
        }
    }

    public void setMeasureMents(float temp, float humidity, float pressure) {
        this.humidity = humidity;
        this.pressure = pressure;
        this.temp = temp;
        measurementsChanged();
    }

    //通知观察者做出修改
    private void measurementsChanged() {
        notifyObservers();
    }
}
