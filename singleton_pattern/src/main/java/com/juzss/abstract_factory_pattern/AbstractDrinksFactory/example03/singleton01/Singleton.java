package com.juzss.abstract_factory_pattern.AbstractDrinksFactory.example03.singleton01;

/**
 * CLassName  singleton
 * Description TODO 立即加载 恶汉模式
 *
 * @Author Shinelon
 * @Date 2019/4/11 10:23
 * @Version 1.0
 **/
public class Singleton {

    // 将自身实例对象设置为一个属性,并用static,final修饰
    private  static final  Singleton instance = new Singleton();


    //构造方法私有化
    private  Singleton(){

    }

    //静态方法返回实例
    public  static synchronized Singleton getInstance(){
        return  instance;
    }
}
