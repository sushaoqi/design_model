package com.juzss.builder_pattern;

/**
 * CLassName  MealBuilder
 * Description TODO 抽象建造者
 *
 * @Author Shinelon
 * @Date 2019/4/13 21:14
 * @Version 1.0
 **/
public abstract class MealBuilder {

    Meal meal = new Meal();

    public abstract  void buildFood();

    public abstract  void buildDrink();


    public Meal getMeal(){
        return meal;
    }
}
