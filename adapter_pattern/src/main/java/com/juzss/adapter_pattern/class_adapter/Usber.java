package com.juzss.adapter_pattern.class_adapter;

/**
 * CLassName  Usber
 * Description TODO Usber接口实现类
 *
 * @Author Shinelon
 * @Date 2019/4/12 17:13
 * @Version 1.0
 **/
public class Usber implements Usb{

    @Override
    public void isUsb() {
        System.out.println("Usb口");
    }
}
