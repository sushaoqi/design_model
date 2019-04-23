package com.juzss.builder_pattern;

/**
 * CLassName  Test
 * Description TODO
 *
 * @Author Shinelon
 * @Date 2019/4/13 21:21
 * @Version 1.0
 **/
public class Test {

    public static void main(String[] args){
        //套餐A
        MealA a = new MealA();
        //准备套餐A的服务员
        KFCWaiter waiter = new KFCWaiter(a);
        //获得套餐
        Meal mealA = waiter.construct();
        System.out.println("套餐A组成部分:");
        System.out.println("食物: " +mealA.getFood()+";"+"饮料: "+mealA.getDrink());


    }
}
