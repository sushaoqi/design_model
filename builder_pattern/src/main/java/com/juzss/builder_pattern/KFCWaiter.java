package com.juzss.builder_pattern;

/**
 * CLassName  KFCWaiter
 * Description TODO 指挥者
 *
 * @Author Shinelon
 * @Date 2019/4/13 21:18
 * @Version 1.0
 **/
public class KFCWaiter {

    private MealBuilder mealBuilder;

    public KFCWaiter(MealBuilder mealBuilder){
        this.mealBuilder = mealBuilder;
    }

    public Meal construct(){
        //准备食物
        mealBuilder.buildFood();
        //准备饮料
        mealBuilder.buildDrink();
        //准备完毕，返回一个完整的套餐给客户
        return mealBuilder.getMeal();
    }


}
