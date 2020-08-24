package com.example.designpattern.factory;

/**
 * @author liuguobin
 * @Title: PizzaStore
 * @ProjectName spring-boot-mybatisplus-3.1.x
 * @Description: 披萨商店
 * @date 2020/7/7 5:07 PM
 */
public abstract class PizzaStore {


    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(String type);

}
