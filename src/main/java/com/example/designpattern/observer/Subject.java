package com.example.designpattern.observer;

/**
 * @author liuguobin
 * @Title: Subject
 * @ProjectName spring-boot-mybatisplus-3.1.x
 * @Description: 主题
 * @date 2020/6/28 10:08 AM
 */
public interface Subject {

    //注册观察者
    public void registerObserver(Observer observer);

    //取消观察者
    public void removerObserver(Observer observer);

    //通知观察者们
    public void notifyObservers();

}
