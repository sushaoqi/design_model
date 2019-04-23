package com.juzss.abstract_factory_pattern.AbstractDrinksFactory.factory_method_pattern;

/**
 * CLassName  Coffee
 * Description TODO
 *  拿铁、美式咖啡、卡布奇诺等均为咖啡家族的一种产品
 *   咖啡则作为一种抽象概念
 * @Author Shinelon
 * @Date 2019/4/11 17:43
 * @Version 1.0
 **/
public abstract class Coffee {

    //获取咖啡名字
    public abstract  String getName();
}
