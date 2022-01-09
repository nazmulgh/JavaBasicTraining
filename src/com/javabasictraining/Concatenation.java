package com.javabasictraining;

public class Concatenation {

    public static void main(String[] args) {

        int number1 = 200;
        int number2 = 300;
        int number3 = 400;
        int number4 = 500;

        int addition = number1 + number2 + number3 + number4;
        System.out.println(addition);
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(number4);

        System.out.println("Addition result is = " + "$" + addition);

        String firstName = "Nazmul";
        String lastName = "Hosain";
        String fullName = firstName + lastName;
        System.out.println(fullName);
        String fullName1 = firstName + " " + lastName;
        System.out.println(fullName1);
        System.out.println("This Is My Full Name: " + fullName1);

        String address = "New York";
        System.out.println("This Is My Address: " + address);


    }


}
