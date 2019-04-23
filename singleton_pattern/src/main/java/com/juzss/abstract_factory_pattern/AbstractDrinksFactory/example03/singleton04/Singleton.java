package com.juzss.abstract_factory_pattern.AbstractDrinksFactory.example03.singleton04;

/**
 * CLassName  singleton
 * Description TODO 静态内部类 线程安全
 *
 * 这种写法仍然使用JVM本身机制保证了线程安全问题;
 * 由于 SingletonHolder 是私有的,除了 getInstance() 之外没有办法访问它,因此它是懒汉式的;
 * 同时读取实例的时候不会进行同步,没有性能缺陷;也不依赖 JDK 版本
 *
 *
 * @Author Shinelon
 * @Date 2019/4/11 10:23
 * @Version 1.0
 **/
public class Singleton {

    //静态内部类
    private static class SingleHolder{
        private static  final Singleton instance = new Singleton();
    }

    //构造函数私有化
    private Singleton(){}

    //第一次调用getInstance方法时，才会去加载SingleHolder类，继而实例化instance
    public static final Singleton getInstance(){
        return SingleHolder.instance;
    }
}
