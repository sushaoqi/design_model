package com.juzss.example07.children;

import com.sun.istack.internal.logging.Logger;

/**
 * CLassName  Cpu
 * Description TODO
 * Disk子系统类
 * @Author Shinelon
 * @Date 2019/4/12 16:00
 * @Version 1.0
 **/
public class Disk {

    //public static final Logger LOGGER = Logger.getLogger(Disk.class);

    public void start(){
        //LOGGER.info("Disk is start....");
        System.out.println("Disk is start....");
    }

    public void shutdown(){
       // LOGGER.info("Disk is shutdown....");
        System.out.println("Disk is shutdown....");
    }
}
