package com.juzss.example2.cglib_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * CLassName  ProxyFactory
 * Description TODO
 * cglib子类代理对象工厂
 * 对UserDao在内存中动态构建子类对象
 * @Author Shinelon
 * @Date 2019/4/11 9:50
 * @Version 1.0
 **/
public class ProxyFactory implements MethodInterceptor {


    //维护目标对象
    private Object target;

    public  ProxyFactory(Object target){
        this.target = target;
    }

    //创建子类对象
    public Object getProxyInstance(){
        //工具类
        Enhancer en = new Enhancer();
        //创建父类
        en.setSuperclass(target.getClass());
        //创建回调函数
        en.setCallback(this);
        //创建子类,代理对象
        return  en.create();
    }


    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("开始事务3----");
        Object returnValue = method.invoke(target, args);
        System.out.println("结束事务3----");
        return  returnValue;
    }
}
