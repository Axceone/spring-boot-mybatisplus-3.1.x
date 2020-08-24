package com.example.designpattern.abstractfactory;


import com.example.designpattern.factory.NYStyleChessPizza;

/**
 * @author liuguobin
 * @Title: NYPizzaStore
 * @ProjectName spring-boot-mybatisplus-3.1.x
 * @Description: 纽约披萨供销商
 * @date 2020/7/7 5:31 PM
 */
public class NYPizzaStore extends PizzaStore {



    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();
        if (type.equals("cheese")) {
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("NY S Pizza");
        }
        return pizza;
    }

}
