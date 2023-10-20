package com.example.demotest;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

@Slf4j
public class Test1 implements B{
    public static void main(String[] args) {
//        Test1 test1 = new Test1();
//        Test1 test2 = new Test1();
//        System.out.println(test1.hashCode());
//        System.out.println(test2.hashCode());
//        test1 = test2;
//        System.out.println(test1.hashCode());
//        System.out.println(test2.hashCode());
//        C.statMetC();
//
//        List<String> list = new ArrayList<>();
//        list.add("ss");
//        list.remove(test1);

//        C.statMetC();
//        B.statMetC();
//
//        StringJoiner joiner = new StringJoiner(".", "prefix-", "-suffix");
//        for (String s : "Hello the brave world".split(" ")) {
//            joiner.add(s);
//        }
//        System.out.println(joiner);

        List<Integer> list = Arrays.asList(2, 4, 5);
        List<Integer> list1 = list.stream()
                .filter(a -> a > 1)
                .toList();

        list1.add(6);


        System.out.println(list1);
    }

    private static void ttt(){
        log.info("start");
        System.out.println("fdfdf");
        System.out.println("fdfdf");
        System.out.println("fdfdf");
        StringBuilder f = new StringBuilder();
        f.append("d");
        log.info("start");
    }

    public void testT(){
        List<String> list = new ArrayList<>(List.of("S1", "S2", "D3"));
        list.add("S5");

        List<String> list1 = new ArrayList<>(Arrays.asList("S1", "S2", "D3"));
        list1.add("S5");

        List<String> stringList = list1.stream()
                .filter(l -> l.startsWith("S"))
                .collect(Collectors.toList());

        stringList.add("S4");

        System.out.println(stringList);
    }

    @Override
    public void metB() {

    }

    @Override
    public void metA() {

    }
}

interface A {
    void metA();
}

interface B extends A, C{
    void metB();

    static void statMetC() {
        System.out.println("statMetC");
    }
}

interface C {
    void metA();
    static void statMetC() {
        System.out.println("statMetC");
    }
}
