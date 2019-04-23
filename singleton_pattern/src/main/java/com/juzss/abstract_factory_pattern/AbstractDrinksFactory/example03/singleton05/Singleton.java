package com.juzss.abstract_factory_pattern.AbstractDrinksFactory.example03.singleton05;

/**
 * CLassName  Singleton
 * Description TODO 枚举 线程安全
 *
 * @Author Shinelon
 * @Date 2019/4/11 10:50
 * @Version 1.0
 **/
public  enum   Singleton {
    //创建枚举默认就是线程安全，而且还能防止反序列化导致重新创建新的对象。
   INSTANCE;
}
