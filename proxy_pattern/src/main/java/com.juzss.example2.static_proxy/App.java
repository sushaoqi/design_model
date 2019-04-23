package com.juzss.example2.static_proxy;

/**
 * CLassName  App
 * Description TODO 测试类
 *
 * @Author Shinelon
 * @Date 2019/4/11 9:33
 * @Version 1.0
 **/
public class App {

    public  static void main(String[] args){

        //目标类对象
        UserDao target = new UserDao();


        //代理对象,把目标对象传给代理对象,建立代理关系
        ProxyUserDao proxy = new ProxyUserDao(target);

        //代理类对象执行方法
        proxy.save();

    }
}
