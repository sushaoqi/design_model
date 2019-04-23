package com.juzss.abstract_factory_pattern;

/**
 * CLassName  ChinaDrinksFactory
 * Description TODO
 * 中国饮品工厂
 * 制造咖啡与茶
 * @Author Shinelon
 * @Date 2019/4/11 18:07
 * @Version 1.0
 **/
public class ChinaDrinksFactory implements AbstractDrinksFactory{
    @Override
    public Coffee createCoffee() {
        return new Latte();
    }

    @Override
    public Tea createTea() {
        return new MuikTea();
    }

    @Override
    public Sodas createSodas() {
        return null;
    }
}
