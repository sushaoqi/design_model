package com.juzss.adapter_pattern.class_adapter;

/**
 * CLassName  Adapter
 * Description TODO Adapter接口适配器
 *
 * @Author Shinelon
 * @Date 2019/4/12 17:13
 * @Version 1.0
 **/
public class Adapter extends  Usber implements Ps2{

    @Override
    public void isPs2() {
        isUsb();
    }
}
