package com.juzss.abstract_factory_pattern.AbstractDrinksFactory.example03.singleton02;

/**
 * CLassName  singleton
 * Description TODO 延迟加载  懒汉式模式
 *
 * @Author Shinelon
 * @Date 2019/4/11 10:23
 * @Version 1.0
 **/
public class Singleton {


    //将自身实例对象设置为一个属性,并用static修饰
    private static Singleton instance;


    //构造方法私有化
    private Singleton(){

    }

    //静态方法实例化 第一种,多线程不安全
    /*public static Singleton getSingleton(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }*/

    //延迟性,多线程情况下懒汉是安全的
    public static synchronized Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }




}
