package com.example.designpattern.decorator.starbuzzcoffe;

/**
 * @author liuguobin
 * @Title: CondimentDecorator
 * @ProjectName spring-boot-mybatisplus-3.1.x
 * @Description: 抽象装饰者 -- 调味品程序类
 * @date 2020/6/30 11:21 AM
 */
public abstract class CondimentDecorator extends Beverage {

    public abstract String getDescription();

}
