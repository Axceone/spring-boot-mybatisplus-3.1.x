package com.example.designpattern.abstractfactory;

import com.example.designpattern.abstractfactory.ingredient.Cheese;
import com.example.designpattern.abstractfactory.ingredient.Clams;
import com.example.designpattern.abstractfactory.ingredient.Dough;
import com.example.designpattern.abstractfactory.ingredient.Pepperoni;
import com.example.designpattern.abstractfactory.ingredient.Sauce;
import com.example.designpattern.abstractfactory.ingredient.Veggies;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuguobin
 * @Title: Pizza
 * @ProjectName spring-boot-mybatisplus-3.1.x
 * @Description: 抽象-披萨
 * @date 2020/7/7 5:08 PM
 */
public abstract class Pizza {

    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;

    List toppings = new ArrayList();

    abstract void prepare();

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

    public void setName(String name) {
        this.name = name;
    }
}
