package com.example.designpattern.abstractfactory;


/**
 * @author liuguobin
 * @Title: PizzaTestDrive
 * @ProjectName spring-boot-mybatisplus-3.1.x
 * @Description: Pizza 生产测试
 * @date 2020/7/7 5:40 PM
 */
public class PizzaTestDrive {

    public static void main(String[] args) {

        PizzaStore pizzaStore = new NYPizzaStore();
        Pizza chess = pizzaStore.orderPizza("cheese");

        System.out.println("Joel ordered a" + chess.getName());
    }

}
