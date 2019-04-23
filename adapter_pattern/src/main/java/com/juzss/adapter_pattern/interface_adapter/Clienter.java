package com.juzss.adapter_pattern.interface_adapter;

/**
 * CLassName  Client
 * Description TODO 接口适配器
 *
 * @Author Shinelon
 * @Date 2019/4/12 17:28
 * @Version 1.0
 **/
public class Clienter {

    public static  void main(String[] args){
        A a = new Alishi();
        a.a();
        a.d();
    }
}
