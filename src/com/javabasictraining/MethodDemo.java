package com.javabasictraining;

public class MethodDemo {

//    int a = 10;
//    int b = 20;

    static double a = 10.5;
    static double b = 20.5;

    //  Method or Function
    public static void sayHello() {
        System.out.println("My Name Is Java");
    }

    public static void sayBuy() {
        System.out.println("Say bye bye");
    }

    public static void addition() {
        System.out.println(a + b);
    }

    public static void logic() {
        if (a > b) {
            double c = a + b;
        } else {
            System.out.println("Dont do any thing");
        }
    }

    public static double sum() {
        return a + b;
    }

//    public static void main(String[] args) {
//        MethodDemo methodDemo = new MethodDemo();
//        methodDemo.sayHello();
//        methodDemo.sayBuy();
//        methodDemo.addition();
//        methodDemo.logic();
//        System.out.println(methodDemo.sum());
//    }

}
