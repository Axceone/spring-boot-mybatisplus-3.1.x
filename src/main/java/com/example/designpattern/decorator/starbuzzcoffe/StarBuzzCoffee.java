package com.example.designpattern.decorator.starbuzzcoffe;

/**
 * @author liuguobin
 * @Title: StarBuzzCoffee
 * @ProjectName spring-boot-mybatisplus-3.1.x
 * @Description: 星巴克系统
 * @date 2020/6/30 11:32 AM
 */
public class StarBuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        Beverage beverage2 = new HouseBlend();

        beverage.setSize("小杯");
        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);

        beverage2.setSize("中杯");
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);

        System.out.println(beverage.getSize() + "," + beverage.getDescription() + "。总价: $" + beverage.cost());
        System.out.println(beverage2.getSize() + "," + beverage2.getDescription() + "。总价：$" + beverage2.cost());

    }
}
