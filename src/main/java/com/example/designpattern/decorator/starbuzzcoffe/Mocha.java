package com.example.designpattern.decorator.starbuzzcoffe;

/**
 * @author liuguobin
 * @Title: Mocha
 * @ProjectName spring-boot-mybatisplus-3.1.x
 * @Description: 装饰者 -- 饮料调料，摩卡
 * @date 2020/6/30 11:29 AM
 */
public class Mocha extends Soy {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        super(beverage);
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.description + "，添加 摩卡 " + super.getDescription();
    }

    @Override
    public String getSize() {
        return beverage.getSize();
    }

    @Override
    public double cost() {
        return beverage.cost() + .89 + super.cost();
    }

}
