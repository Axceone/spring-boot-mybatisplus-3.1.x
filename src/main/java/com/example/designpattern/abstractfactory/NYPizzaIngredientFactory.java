package com.example.designpattern.abstractfactory;

import com.example.designpattern.abstractfactory.ingredient.Cheese;
import com.example.designpattern.abstractfactory.ingredient.Clams;
import com.example.designpattern.abstractfactory.ingredient.Dough;
import com.example.designpattern.abstractfactory.ingredient.Pepperoni;
import com.example.designpattern.abstractfactory.ingredient.Sauce;
import com.example.designpattern.abstractfactory.ingredient.Veggies;

/**
 * @author liuguobin
 * @Title: NYPizzaIngredientFactory
 * @ProjectName spring-boot-mybatisplus-3.1.x
 * @Description: 纽约原理工厂
 * @date 2020/7/9 4:23 PM
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new Dough();
    }

    @Override
    public Sauce createSauce() {
        return new Sauce();
    }

    @Override
    public Cheese createCheese() {
        return new Cheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[0];
    }

    @Override
    public Pepperoni createPepperoni() {
        return new Pepperoni();
    }

    @Override
    public Clams createClams() {
        return new Clams();
    }
}
