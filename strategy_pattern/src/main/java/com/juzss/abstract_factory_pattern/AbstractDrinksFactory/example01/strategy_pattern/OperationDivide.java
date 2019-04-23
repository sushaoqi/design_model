package com.juzss.abstract_factory_pattern.AbstractDrinksFactory.example01.strategy_pattern;

/**
 * CLassName  OperationDivide
 * Description TODO 实现触发
 *
 * @Author Shinelon
 * @Date 2019/4/10 11:44
 * @Version 1.0
 **/
public class OperationDivide implements  Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        if(num2 == 0){
          throw  new ArithmeticException("除数不能为0");
        }
        return num1 / num2;
    }
}
