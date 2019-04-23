package com.juzss.builder_pattern;

/**
 * CLassName  MealA
 * Description TODO 具体建造者A
 *
 * @Author Shinelon
 * @Date 2019/4/13 21:16
 * @Version 1.0
 **/
public class MealA extends MealBuilder {


    @Override
    public void buildFood() {
        System.out.println("薯条");
    }

    @Override
    public void buildDrink() {
        System.out.println("可乐");
    }
}
