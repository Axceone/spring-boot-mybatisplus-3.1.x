package com.example.designpattern.factory;

/**
 * @author liuguobin
 * @Title: NYStyleChessPizza
 * @ProjectName spring-boot-mybatisplus-3.1.x
 * @Description: 纽约风格pizza
 * @date 2020/7/7 5:34 PM
 */
public class NYStyleChessPizza extends Pizza {

    public NYStyleChessPizza (){
        name = "纽约风格pizza";
        toppings.add("超级无敌披萨");
    }

    public void cut() {
        System.out.println("无敌的加工");
    }

}
