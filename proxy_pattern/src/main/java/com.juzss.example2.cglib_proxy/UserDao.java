package com.juzss.example2.cglib_proxy;

/**
 * CLassName  UserDao
 * Description TODO 目标对象,没有实现任何接口
 *
 * @Author Shinelon
 * @Date 2019/4/11 9:48
 * @Version 1.0
 **/
public class UserDao {

    public  void save(){
        System.out.println("----已保存的数据----");
    }
}
