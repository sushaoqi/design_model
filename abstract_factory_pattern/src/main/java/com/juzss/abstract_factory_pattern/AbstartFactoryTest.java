package com.juzss.abstract_factory_pattern;

/**
 * CLassName  AbstartFactoryTest
 * Description TODO
 * 抽象工厂测试类
 * @Author Shinelon
 * @Date 2019/4/11 18:16
 * @Version 1.0
 **/
public class AbstartFactoryTest {


    static void print(Drink drink){
        if(drink == null){
            System.out.println("产品：--" );
        }else{
            System.out.println("产品：" + drink.getName());
        }
    }

    public static void main(String[] args){
        AbstractDrinksFactory chinaDrinksFactory = new ChinaDrinksFactory();
        Coffee coffee = chinaDrinksFactory.createCoffee();
        Tea tea = chinaDrinksFactory.createTea();
        Sodas sodas = chinaDrinksFactory.createSodas();
        System.out.println("中国饮品工厂有如下产品：");
        print(coffee);
        print(tea);
        print(sodas);


        AbstractDrinksFactory americaDrinksFactory = new AmericaDrinksFactory();
        coffee = americaDrinksFactory.createCoffee();
        tea = americaDrinksFactory.createTea();
        sodas = americaDrinksFactory.createSodas();
        System.out.println("美国饮品工厂如下产品: ");
        print(coffee);
        print(tea);
        print(sodas);


    }
}
