package com.javabasictraining;

public class ScopeAccess {

    //Fields variable - Global variable
    private String name;
    public int age;
    public int salary;
    public String company;

    public void eat(String names, int ssn) {

        double price = 2.99;
        int result = 30;
        name = "Nazmul Hosain";
    }

    public void cook() {

        double outOfStock;
        int bonus;
        double price = 2.99;
        company = "training";


    }


}
