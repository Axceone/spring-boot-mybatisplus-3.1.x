package com.example.designpattern.observer.custompattern;

/**
 * @author liuguobin
 * @Title: Observer
 * @ProjectName spring-boot-mybatisplus-3.1.x
 * @Description: 观察者
 * @date 2020/6/28 10:09 AM
 */
public interface Observer {

    //主题修改，观察者做出对应修改
    public void update(float temp, float humidity, float pressure);

}
