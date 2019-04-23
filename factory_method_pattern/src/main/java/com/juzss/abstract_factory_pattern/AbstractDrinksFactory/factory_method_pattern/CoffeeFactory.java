package com.juzss.abstract_factory_pattern.AbstractDrinksFactory.factory_method_pattern;

/**
 * CLassName  CoffeeFactory
 * Description TODO
 * 定义一个抽象的咖啡工厂
 * @Author Shinelon
 * @Date 2019/4/11 17:40
 * @Version 1.0
 **/
public abstract class CoffeeFactory{

    //生产可制造的咖啡
    public abstract Coffee[] createCoffee();
}