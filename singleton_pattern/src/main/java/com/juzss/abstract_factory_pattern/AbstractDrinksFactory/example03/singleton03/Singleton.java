package com.juzss.abstract_factory_pattern.AbstractDrinksFactory.example03.singleton03;

/**
 * CLassName  singleton
 * Description TODO DCL双检查锁机制（DCL：double checked locking）
 *
 * @Author Shinelon
 * @Date 2019/4/11 10:23
 * @Version 1.0
 **/
public class Singleton {

    //将自身实例化对象设置为一个属性,并用static修饰
    private  static Singleton instance;

    //构造函数私有化
    private Singleton(){

    }

    //静态方法返回实例
    public  static Singleton getInstance(){
        //第一次检测instance是否被实例化,如果没有进入if语句
        if(instance == null){
            synchronized (Singleton.class){
                //第二次检查instance是否被实例化,如果没有,则最终实例化返回实例
                if (instance == null){
                     instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
