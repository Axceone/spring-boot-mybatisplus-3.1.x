package com.example.designpattern.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuguobin
 * @Title: Pizza
 * @ProjectName spring-boot-mybatisplus-3.1.x
 * @Description: 抽象-披萨
 * @date 2020/7/7 5:08 PM
 */
public class Pizza {

    String name;
    String dough;
    String sauce;

    List toppings = new ArrayList();

    void prepare() {
        System.out.println("Preparing" + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding source...");
        System.out.println("Adding toppings: ");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println("    " + toppings.get(i));
        }
    }

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }
}