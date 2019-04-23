package com.juzss.bridge;

/**
 * CLassName  Client
 * Description TODO 客户端
 *
 * @Author Shinelon
 * @Date 2019/4/13 23:33
 * @Version 1.0
 **/
public class Client {

    public static  void main(String[] args){
        //白色
        Color white = new White();
        //正方形
        Shape square = new Square();
        //白色的正方形
        square.setColor(white);
        square.draw();

        //长方形
        Shape rectange = new Rectangle();
        rectange.setColor(white);
        rectange.draw();
    }
}
