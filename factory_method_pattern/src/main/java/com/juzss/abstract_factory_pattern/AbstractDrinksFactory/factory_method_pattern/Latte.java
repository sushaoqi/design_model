package com.juzss.abstract_factory_pattern.AbstractDrinksFactory.factory_method_pattern;

/**
 * CLassName  Latte
 * Description TODO 拿铁
 *
 * @Author Shinelon
 * @Date 2019/4/11 17:49
 * @Version 1.0
 **/
public class Latte extends Coffee{
    @Override
    public String getName() {
        return "拿铁";
    }
}
