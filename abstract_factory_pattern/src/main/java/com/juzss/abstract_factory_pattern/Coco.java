package com.juzss.abstract_factory_pattern;

/**
 * CLassName  Coco
 * Description TODO 可口可乐
 *
 * @Author Shinelon
 * @Date 2019/4/11 18:13
 * @Version 1.0
 **/
public class Coco extends Sodas{

    @Override
    public String createSodas() {
        return "制造碳酸饮料";
    }

    @Override
    public String getName() {
        return "可口可乐";
    }
}
