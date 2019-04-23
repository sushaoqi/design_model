package com.juzss.abstract_factory_pattern;

/**
 * CLassName  AbstractDrinksFactory
 * Description TODO 抽象的饮料产品家族制造工厂
 *
 * @Author Shinelon
 * @Date 2019/4/11 18:02
 * @Version 1.0
 **/
public interface AbstractDrinksFactory {


    //制造咖啡
    Coffee createCoffee();

    //制造茶
    Tea createTea();

    //制造碳酸饮料
    Sodas createSodas();
}
