package com.juzss.abstract_factory_pattern.AbstractDrinksFactory.example03;

import com.juzss.abstract_factory_pattern.AbstractDrinksFactory.example03.singleton05.Singleton;

/**
 * CLassName  SingletonDemo
 * Description TODO
 *
 * @Author Shinelon
 * @Date 2019/4/11 10:52
 * @Version 1.0
 **/
public class SingletonDemo implements Runnable {

   public  static void main(String[] args){
       SingletonDemo[] threads = new SingletonDemo[10];
       for(int i = 0; i<threads.length;i++){
           threads[i] = new SingletonDemo();
       }
       for(int i = 0; i<threads.length;i++){
           new Thread(threads[i]).start();
       }
   }

    @Override
    public void run() {
        //1555014783585s 饿汉式加载  测试是singleton01 加synchroized
        //1555642155525s 懒汉式加载  测试是singleton02 加synchronized
        //1556717572543s 双重锁加载  测试是singleton03  没有synchronized情况  单线程安全,多线程不安全
        //1555168076870s 静态内部类  测试是singleton04
        //System.out.println(Singleton.getInstance().hashCode()+System.currentTimeMillis()+"s");
        //1556975708723s  枚举情况
        System.out.println(Singleton.INSTANCE.hashCode()+System.currentTimeMillis()+"s");


    }
}
