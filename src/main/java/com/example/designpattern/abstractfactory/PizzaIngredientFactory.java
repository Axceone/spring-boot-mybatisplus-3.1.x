package com.example.designpattern.abstractfactory;

import com.example.designpattern.abstractfactory.ingredient.Cheese;
import com.example.designpattern.abstractfactory.ingredient.Clams;
import com.example.designpattern.abstractfactory.ingredient.Dough;
import com.example.designpattern.abstractfactory.ingredient.Pepperoni;
import com.example.designpattern.abstractfactory.ingredient.Sauce;
import com.example.designpattern.abstractfactory.ingredient.Veggies;

/**
 * @author liuguobin
 * @Title: PizzaIngredientFactory
 * @ProjectName spring-boot-mybatisplus-3.1.x
 * @Description: 披萨原料制造抽象接口
 * @date 2020/7/9 4:09 PM
 */
public interface PizzaIngredientFactory {

    //创建面团
    public Dough createDough();

    //创建酱
    public Sauce createSauce();

    public Cheese createCheese();

    public Veggies[] createVeggies();

    public Pepperoni createPepperoni();

    public Clams createClams();
}

