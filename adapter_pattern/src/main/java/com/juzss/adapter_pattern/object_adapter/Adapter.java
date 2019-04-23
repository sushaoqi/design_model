package com.juzss.adapter_pattern.object_adapter;

/**
 * CLassName  Adapter
 * Description TODO 适配器接口
 *
 * @Author Shinelon
 * @Date 2019/4/12 17:18
 * @Version 1.0
 **/
public class Adapter implements Ps2{

    private  Usb usb;

    public Adapter(Usb usb){
        this.usb = usb;
    }


    @Override
    public void isPs2() {
       usb.isUsb();
    }
}
