package com.juzss.abstract_factory_pattern.AbstractDrinksFactory.factory_method_pattern;

/**
 * CLassName  FactoryTest
 * Description TODO 工厂方法测试
 *
 * @Author Shinelon
 * @Date 2019/4/11 17:52
 * @Version 1.0
 **/
public class FactoryTest {

    static  void print(Coffee[] c){
        for (Coffee coffee : c){
            System.out.println(coffee.getName());
        }
    }


    public static void main(String[] args){
        ChinaCoffeeFactory chinaCoffeeFactory = new ChinaCoffeeFactory();
        Coffee[] chinaCoffees = chinaCoffeeFactory.createCoffee();
        System.out.println("中国咖啡工厂可以生产的咖啡有: ");
        print(chinaCoffees);
        AmericaCoffeeFactory americaCoffeeFactory = new AmericaCoffeeFactory();
        Coffee[] americaCoffees = americaCoffeeFactory.createCoffee();
        System.out.println("美国咖啡工厂可以生产的咖啡有: ");
        print(americaCoffees);
    }
}
