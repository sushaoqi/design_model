package com.juzss.adapter_pattern.object_adapter;

/**
 * CLassName  Clienter
 * Description TODO
 * 对象适配器 通过组合功能完成适配
 * @Author Shinelon
 * @Date 2019/4/12 17:21
 * @Version 1.0
 **/
public class Clienter {


    public static void main(String[] args){
        Ps2 ps2 = new Adapter(new Useber());
        ps2.isPs2();
    }
}
