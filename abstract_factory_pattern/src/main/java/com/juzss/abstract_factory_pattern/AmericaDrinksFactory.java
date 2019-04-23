package com.juzss.abstract_factory_pattern;

/**
 * CLassName  AmericaDrinksFactory
 * Description TODO
 * 美国制造工厂
 * 制造碳酸和咖啡
 * @Author Shinelon
 * @Date 2019/4/11 18:15
 * @Version 1.0
 **/
public class AmericaDrinksFactory implements  AbstractDrinksFactory{

    @Override
    public Coffee createCoffee() {
        return new Latte();
    }

    @Override
    public Tea createTea() {
        return null;
    }

    @Override
    public Sodas createSodas() {
        return new Coco();
    }
}
