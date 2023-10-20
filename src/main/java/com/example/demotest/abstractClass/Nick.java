package com.example.demotest.abstractClass;

public class Nick extends Person{

    public Nick(String name) {
        super(name);
    }

    public static void main(String[] args) {
        Nick nick = new Nick("Nick");
        Person person = new Nick("Nick2");
        System.out.println(nick.callName());
    }

    @Override
    String callName() {
        return "Call Nick";
    }
}
