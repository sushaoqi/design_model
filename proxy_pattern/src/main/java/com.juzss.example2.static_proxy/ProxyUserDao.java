package com.juzss.example2.static_proxy;

/**
 * CLassName  ProxyUserDao
 * Description TODO
 * 代理对象 静态代理
 *
 * @Author Shinelon
 * @Date 2019/4/11 9:31
 * @Version 1.0
 **/
public class ProxyUserDao implements IUserDao{

    //目标类对象
    private IUserDao target;

    public ProxyUserDao(IUserDao target){
        this.target =target;
    }


    @Override
    public void save() {
        System.out.println("开始事务....");
        target.save(); //实现目标类对象方法
        System.out.println("结束事务....");
    }
}
