package com.example.designpattern.observer.jdkpattern;

import java.util.Observable;

/**
 * @author liuguobin
 * @Title: WeatherDate
 * @ProjectName spring-boot-mybatisplus-3.1.x
 * @Description: 天气
 * @date 2020/6/28 10:20 AM
 */
public class WeatherDate extends Observable {

    private float temp;
    private float humidity;
    private float pressure;


    public WeatherDate() {
    }

//    @Override
//    public void registerObserver(Observer observer) {
//        observers.add(observer);
//    }
//
//    @Override
//    public void removerObserver(Observer observer) {
//        int i = observers.indexOf(observer);
//        observers.remove(i);
//    }
//
//    @Override
//    public void notifyObservers() {
//        for (int i = 0; i < observers.size(); i++) {
//            Observer observer = observers.get(i);
//            //通知观察者做出改变
//            observer.update(temp,humidity,pressure);
//        }
//    }

    public void setMeasurements(float temp, float humidity, float pressure) {
        this.humidity = humidity;
        this.pressure = pressure;
        this.temp = temp;
        measurementsChanged();
    }

    //通知观察者做出修改
    private void measurementsChanged() {
        setChanged();
        notifyObservers("你好");
    }

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }
}
