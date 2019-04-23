package com.juzss.abstract_factory_pattern;

/**
 * CLassName  MuikTea
 * Description TODO 奶茶
 *
 * @Author Shinelon
 * @Date 2019/4/11 18:12
 * @Version 1.0
 **/
public class MuikTea extends  Tea {

    @Override
    public String createTea() {
        return "制造茶";
    }

    @Override
    public String getName() {
        return "奶茶";
    }
}
