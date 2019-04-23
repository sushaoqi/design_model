package com.juzss.template_method_pattern;

/**
 * CLassName  Cricket
 * Description TODO Cricket类
 *
 * @Author Shinelon
 * @Date 2019/4/13 10:46
 * @Version 1.0
 **/
public class Cricket extends Game{
    @Override
    void initialize() {
        System.out.println("Cricket Game initialize.Cricket Game startPlay");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game startPlay.Enjoy the Game");
    }

    @Override
    void endPlay() {
        System.out.println("Cricket Game finished");
    }
}
