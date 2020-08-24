package com.example.designpattern.abstractfactory;

/**
 * @author liuguobin
 * @Title: CheesePizza
 * @ProjectName spring-boot-mybatisplus-3.1.x
 * @Description: 芝士披萨
 * @date 2020/7/9 4:35 PM
 */
public class CheesePizza extends Pizza {

    PizzaIngredientFactory pizzaIngredientFactory;

    public CheesePizza (PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing "+name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
    }
}
