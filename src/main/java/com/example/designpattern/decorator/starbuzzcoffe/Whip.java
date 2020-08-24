package com.example.designpattern.decorator.starbuzzcoffe;

/**
 * @author liuguobin
 * @Title: Whip
 * @ProjectName spring-boot-mybatisplus-3.1.x
 * @Description: 装饰者 -- 饮料调料，奶泡
 * @date 2020/6/30 4:51 PM
 */
public class Whip extends CondimentDecorator {

    private Beverage beverage;

    private Double cupRice = 0d;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "，添加 奶泡 ";
    }

    @Override
    public String getSize() {
        return beverage.getSize();
    }

    @Override
    public double cost() {
        if (getSize().equals("中杯")) {
            cupRice = .15;
        }
        return beverage.cost() + .99 + cupRice;
    }
}
