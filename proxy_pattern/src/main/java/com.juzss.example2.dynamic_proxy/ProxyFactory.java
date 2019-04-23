package com.juzss.example2.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * CLassName  ProxyFactory
 * Description TODO
 * 创建动态代理对象
 * 动态代理不需要实现接口,但是要指定接口的类型
 * @Author Shinelon
 * @Date 2019/4/11 9:38
 * @Version 1.0
 **/
public class ProxyFactory {

    //目标类对象
    private Object target;

    public  ProxyFactory(Object target){
        this.target = target;
    }

    //给目标生成代理对象
    public Object getProxyInstance(){
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("开始事务2....");
                        //实现代理对象
                        Object returnValue = method.invoke(target, args);
                        System.out.println("结束事务2");
                        return  returnValue;
                    }
                }
        );
    }
}
