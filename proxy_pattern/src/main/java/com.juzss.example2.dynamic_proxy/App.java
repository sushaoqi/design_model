package com.juzss.example2.dynamic_proxy;

/**
 * CLassName  App
 * Description TODO
 * 测试类
 * @Author Shinelon
 * @Date 2019/4/11 9:43
 * @Version 1.0
 **/
public class App {

    public static  void main(String[] args){

        //目标类对象
        IUserDao target = new UserDao();

        //原始的类型
        System.out.println(target.getClass());

        //给目标类生成代理对象
        IUserDao proxy = (IUserDao) new ProxyFactory(target).getProxyInstance();

        //内存中自动生成代理对象
        System.out.println(proxy.getClass());

        //执行方法 【代理对象】
        proxy.save();


    }
}
