package com.example;

public class App {

    public static void main(String[] args) {
        var context = "hello world";
        var endsWithPeriod = new EndsWithPeriod();
        String result = endsWithPeriod.interpret(context);
        System.out.println(result);
    }

}
