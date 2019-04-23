package com.juzss.example2.cglib_proxy;

import com.juzss.example2.dynamic_proxy.IUserDao;
import com.juzss.example2.dynamic_proxy.UserDao;

/**
 * CLassName  App
 * Description TODO
 * 测试类
 * @Author Shinelon
 * @Date 2019/4/11 9:58
 * @Version 1.0
 **/
public class App {

    public static  void main(String[] args){


        //目标类对象
        IUserDao target = new UserDao();

        //代理对象
        UserDao proxy = (UserDao) new ProxyFactory(target).getProxyInstance();

        //执行代理类的方法
        proxy.save();
    }
}
