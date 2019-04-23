package com.juzss.adapter_pattern.class_adapter;

/**
 * CLassName  Clienter
 * Description TODO 客户端测试类
 * 类适配器 继承实现适配器功能
 * @Author Shinelon
 * @Date 2019/4/12 17:14
 * @Version 1.0
 **/
public class Clienter {

    public static void main(String[] args){
        Ps2 ps2 = new Adapter();
        ps2.isPs2();
    }
}
