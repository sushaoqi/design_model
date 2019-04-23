package com.juzss.abstract_factory_pattern.AbstractDrinksFactory.factory_method_pattern;

/**
 * CLassName  AmericaCoffeeFactory
 * Description TODO 美国工厂只生产美式咖啡和拿铁
 *
 * @Author Shinelon
 * @Date 2019/4/11 17:50
 * @Version 1.0
 **/
public class AmericaCoffeeFactory extends CoffeeFactory {
    @Override
    public Coffee[] createCoffee() {
        return new Coffee[]{new Americano(),new Latte()};
    }
}
