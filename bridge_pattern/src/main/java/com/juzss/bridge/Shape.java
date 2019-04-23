package com.juzss.bridge;

/**
 * CLassName  Shape
 * Description TODO
 *
 * @Author Shinelon
 * @Date 2019/4/13 23:20
 * @Version 1.0
 **/
public abstract class Shape {
    Color color;


    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void  draw();
}
