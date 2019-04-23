package com.juzss.example2.static_proxy;

/**
 * CLassName  UserDao
 * Description TODO
 * 目标对象
 * 实现接口
 *
 *
 * @Author Shinelon
 * @Date 2019/4/11 9:29
 * @Version 1.0
 **/
public class UserDao implements IUserDao {

    @Override
    public void save() {
        System.out.println("----已保存的数据----");
    }
}
