package com.example.designpattern.decorator.starbuzzcoffe;

/**
 * @author liuguobin
 * @Title: Beverage
 * @ProjectName spring-boot-mybatisplus-3.1.x
 * @Description: 抽象组件 -- 饮料抽象类
 * @date 2020/6/30 11:17 AM
 */
public abstract class Beverage {

    String description = "Unknown Beverage";

    private String size;

    public String getDescription() {
        return description;
    }

    //计算价格
    public abstract double cost();

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
