package com.juzss.template_method_pattern;

/**
 * CLassName  TemplatePatternDemo
 * Description TODO 模板测试类
 *
 * @Author Shinelon
 * @Date 2019/4/13 10:50
 * @Version 1.0
 **/
public class TemplatePatternDemo {

    public static  void main(String[] args){
        Game game = new Cricket();
        game.play();
        System.out.println("======");
        game = new FootBall();
        game.play();
    }
}
