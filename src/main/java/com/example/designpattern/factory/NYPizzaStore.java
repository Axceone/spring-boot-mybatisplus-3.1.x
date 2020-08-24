package com.example.designpattern.factory;

/**
 * @author liuguobin
 * @Title: NYPizzaStore
 * @ProjectName spring-boot-mybatisplus-3.1.x
 * @Description: 纽约披萨供销商
 * @date 2020/7/7 5:31 PM
 */
public class NYPizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleChessPizza();
        }
        return null;
    }

}
