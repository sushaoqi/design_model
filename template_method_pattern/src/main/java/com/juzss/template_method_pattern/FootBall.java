package com.juzss.template_method_pattern;

/**
 * CLassName  Football
 * Description TODO Football类
 *
 * @Author Shinelon
 * @Date 2019/4/13 10:46
 * @Version 1.0
 **/
public class FootBall extends Game{
    @Override
    void initialize() {
        System.out.println("Football Game initialize.Football Game startPlay");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game startPlay.Enjoy the Game");
    }

    @Override
    void endPlay() {
        System.out.println("Football Game finished");
    }
}
