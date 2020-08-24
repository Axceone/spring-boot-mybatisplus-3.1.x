package com.example.designpattern.decorator.starbuzzcoffe;

/**
 * @author liuguobin
 * @Title: Soy
 * @ProjectName spring-boot-mybatisplus-3.1.x
 * @Description: 大 中 小杯
 * @date 2020/7/2 4:42 PM
 */
public class Soy extends CondimentDecorator {

    private Beverage beverage;

    public Soy (Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getSize() {
        return beverage.getSize();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        if (getSize() == "大杯") {
            cost += .99;
        }
        return cost;
    }
}
