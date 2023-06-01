package com.example.demotest;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Test1 {
    public static void main(String[] args) {
        log.info("start");
        System.out.println("Test4");
        System.out.println("Test6");
        System.out.println("Test11");
        System.out.println("Test113");
        System.out.println("Test111");
        System.out.println("Test131");
        System.out.println("Test131");
        System.out.println("Test111");
        log.info("finish");
    }

    private static void ttt(){
        log.info("start");
        System.out.println("fdfdf");
        System.out.println("fdfdf");
        log.info("start");
    }

    public void testT(){
        log.info("start");
        System.out.println("fdfdf");
        System.out.println("fdfdf");
        log.info("start2");
    }
}
