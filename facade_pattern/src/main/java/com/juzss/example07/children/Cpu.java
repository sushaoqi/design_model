package com.juzss.example07.children;

import com.sun.istack.internal.logging.Logger;

/**
 * CLassName  Cpu
 * Description TODO
 * Cpu子系统类
 * @Author Shinelon
 * @Date 2019/4/12 16:00
 * @Version 1.0
 **/
public class Cpu {

    //public static final Logger LOGGER = Logger.getLogger(Cpu.class);

    public void start(){
        //LOGGER.info("Cpu is start....");
        System.out.println("Cpu is start....");
    }

    public void shutdown(){
        //LOGGER.info("Cpu is shutdown....");
        System.out.println("Cpu is shutdown....");
    }
}
