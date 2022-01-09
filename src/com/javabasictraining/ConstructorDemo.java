package com.javabasictraining;

public class ConstructorDemo {

    String name;
    String age;
    int ssn;
    int salary;

    public ConstructorDemo(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public ConstructorDemo(String name, String age, int ssn) {
        this.name = name;
        this.age = age;
        this.ssn = ssn;
    }

    public ConstructorDemo(String name, String age, int ssn, int salary) {
        this.name = name;
        this.age = age;
        this.ssn = ssn;
        this.salary = salary;
    }

    public void name() {
        System.out.println(name);
    }

    public void age() {
        System.out.println(age);
    }

    public void ssn() {
        System.out.println(ssn);
    }

    public void salary() {
        System.out.println(salary);
    }


}
