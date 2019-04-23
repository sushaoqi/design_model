package com.juzss.template_method_pattern;

/**
 * CLassName  Game
 * Description TODO Game模板类
 *
 * @Author Shinelon
 * @Date 2019/4/13 10:43
 * @Version 1.0
 **/
public abstract class Game {

    abstract void initialize();

    abstract void startPlay();

    abstract void endPlay();

    //模板类
    public final void play(){

        //初始化游戏
        initialize();

        //开始游戏
        startPlay();

        //结束游戏
        endPlay();
    }
}
