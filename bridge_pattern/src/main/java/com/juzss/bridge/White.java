package com.juzss.bridge;

/**
 * CLassName  White
 * Description TODO
 *
 * @Author Shinelon
 * @Date 2019/4/13 23:31
 * @Version 1.0
 **/
public class White implements Color {
    @Override
    public void bepaint(String shape) {
        System.out.println("白色的"+shape);
    }
}
