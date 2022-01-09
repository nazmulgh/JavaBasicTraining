package com.javabasictraining;

public class ConstructorTest {

    public static void main(String[] args) {

        ConstructorDemo demo = new ConstructorDemo("Nazmul Hosain", "43,");
        ConstructorDemo demo1 = new ConstructorDemo("Nazmul Hosain", "43,", 123);
        ConstructorDemo demo2 = new ConstructorDemo("Nazmul Hosain", "43,", 123, 1000);

        demo.name();
        demo.age();
        demo1.ssn();
        demo2.salary();


    }


}
