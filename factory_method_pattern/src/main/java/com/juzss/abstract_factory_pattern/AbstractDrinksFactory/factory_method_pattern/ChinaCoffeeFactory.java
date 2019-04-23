package com.juzss.abstract_factory_pattern.AbstractDrinksFactory.factory_method_pattern;

/**
 * CLassName  ChinaCoffeeFactory
 * Description TODO
 * 中国咖啡厅只制造卡布奇诺和拿铁
 * @Author Shinelon
 * @Date 2019/4/11 17:46
 * @Version 1.0
 **/
public class ChinaCoffeeFactory extends  CoffeeFactory {
    @Override
    public Coffee[] createCoffee() {
        return new Coffee[]{new Cappuqino(),new Latte()};
    }
}
