package com.example.demotest.abstractClass;

public abstract class Person {
    String name;

    abstract String callName();

    public Person(String name) {
        System.out.println(name);
        this.name = name;
    }
}
