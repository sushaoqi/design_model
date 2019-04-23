package com.juzss.example07.facade;

import com.juzss.example07.children.Cpu;
import com.juzss.example07.children.Disk;
import com.juzss.example07.children.Memory;
import com.sun.istack.internal.logging.Logger;

/**
 * CLassName  Cpu
 * Description TODO
 * 门面核心类
 * @Author Shinelon
 * @Date 2019/4/12 16:00
 * @Version 1.0
 **/
public class Computer {

   // public static final Logger LOGGER = Logger.getLogger(Computer.class);

    private Cpu cpu;
    private Disk disk;
    private Memory memory;

    public Computer(){
        cpu = new Cpu();
        disk = new Disk();
        memory = new Memory();
    }

    public void start(){
        //LOGGER.info("Computer start is begin....");
        System.out.println("Computer start is begin....");
        cpu.start();
        disk.start();
        memory.start();
        //LOGGER.info("Computer start is end....");
        System.out.println("Computer start is end....");
    }

    public void shutdown(){
        System.out.println("Computer shutdown is begin....");
        //LOGGER.info("Computer is shutdown begin....");
        cpu.shutdown();
        disk.shutdown();
        memory.shutdown();
        //LOGGER.info("Computer shutdown is end....");
        System.out.println("Computer shutdown is end....");
    }
}
