package com.juzss.abstract_factory_pattern;

/**
 * CLassName  Latte
 * Description TODO 拿铁
 *
 * @Author Shinelon
 * @Date 2019/4/11 18:09
 * @Version 1.0
 **/
public class Latte extends Coffee{

    @Override
    public String createCoffee() {
      return "制造咖啡";
    }

    @Override
    public String getName() {
        return "拿铁";
    }
}
