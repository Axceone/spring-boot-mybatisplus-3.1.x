package com.example.designpattern.decorator.starbuzzcoffe;

/**
 * @author liuguobin
 * @Title: Espresso
 * @ProjectName spring-boot-mybatisplus-3.1.x
 * @Description: 具体组件 -- 浓缩咖啡实现类
 * @date 2020/6/30 11:23 AM
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso 咖啡";
    }

    @Override
    public double cost() {
        return 1.99;
    }


}
