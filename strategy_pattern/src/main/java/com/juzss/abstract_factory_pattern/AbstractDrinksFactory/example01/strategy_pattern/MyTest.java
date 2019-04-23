package com.juzss.abstract_factory_pattern.AbstractDrinksFactory.example01.strategy_pattern;

/**
 * CLassName  MyTest
 * Description TODO
 *
 * @Author Shinelon
 * @Date 2019/4/10 11:46
 * @Version 1.0
 **/
public class MyTest {

    public static void main(String[] args){
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = "+context.executeStrategy(10,5));
        context = new Context(new OperationSubtract());
        System.out.println("10 - 5 =" + context.executeStrategy(10,5));
        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = "+context.executeStrategy(10,5));
        context =new Context(new OperationDivide());
        System.out.println("10 / 5 = " +context.executeStrategy(10,5));
    }
}
