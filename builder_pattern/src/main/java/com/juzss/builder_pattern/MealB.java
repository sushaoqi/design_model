package com.juzss.builder_pattern;

/**
 * CLassName  MealB
 * Description TODO 具体建造者B
 *
 * @Author Shinelon
 * @Date 2019/4/13 21:17
 * @Version 1.0
 **/
public class MealB extends MealBuilder{
    @Override
    public void buildFood() {
        System.out.println("鸡翅");
    }

    @Override
    public void buildDrink() {
        System.out.println("柠檬果汁");
    }
}
