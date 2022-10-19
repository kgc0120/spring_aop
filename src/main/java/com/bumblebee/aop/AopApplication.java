package com.bumblebee.aop;

import lib.PrintJarMain;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AopApplication {

    public static void main(String[] args) {

        PrintJarMain printJarMain = new PrintJarMain();
        System.out.println("<<<<<===============>>>>>>>>>");
        printJarMain.print();
        System.out.println("<<<<<===============>>>>>>>>>");
        printJarMain.test();
        System.out.println("<<<<<===============>>>>>>>>>");
        SpringApplication.run(AopApplication.class, args);
    }

}
