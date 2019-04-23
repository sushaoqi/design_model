package com.juzss.abstract_factory_pattern.AbstractDrinksFactory.example01.strategy_pattern;

/**
 * CLassName  OperationSubtract
 * Description TODO 实现加法
 *
 * @Author Shinelon
 * @Date 2019/4/10 11:42
 * @Version 1.0
 **/
public class OperationSubtract implements  Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
