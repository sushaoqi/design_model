package com.juzss.abstract_factory_pattern.AbstractDrinksFactory.example01.strategy_pattern;

/**
 * CLassName  Context
 * Description TODO Context是使用策略类的一个类,是实现策略类的一个接口的实现
 *
 * @Author Shinelon
 * @Date 2019/4/10 11:40
 * @Version 1.0
 **/
public class Context {


    private  Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int  executeStrategy(int num1,int num2){
        return strategy.doOperation(num1,num2);
    }
}
