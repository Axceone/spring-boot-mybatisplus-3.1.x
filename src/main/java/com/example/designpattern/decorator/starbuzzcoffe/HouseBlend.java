package com.example.designpattern.decorator.starbuzzcoffe;

/**
 * @author liuguobin
 * @Title: HouseBlend
 * @ProjectName spring-boot-mybatisplus-3.1.x
 * @Description: 具体组件 -- 首选咖啡实现类
 * @date 2020/6/30 11:25 AM
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "HouseBlend 咖啡";
    }

    @Override
    public double cost() {
        return .89;
    }

    public String dazhe(){
        return "打折了";
    }
}
