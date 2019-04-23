package com.juzss.example07;

import com.juzss.example07.facade.Computer;
import com.sun.istack.internal.logging.Logger;

/**
 * CLassName  Client
 * Description TODO
 * 客户端类
 * @Author Shinelon
 * @Date 2019/4/12 16:05
 * @Version 1.0
 **/
public class Client {
    //public static  final Logger LOGGER = Logger.getLogger(Client.class);

    public static void main(String[] args){
        Computer computer = new Computer();
        computer.start();
        //LOGGER.info("==========");
        System.out.println("===========");
        computer.shutdown();
    }
}
