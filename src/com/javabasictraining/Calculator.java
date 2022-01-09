package com.javabasictraining;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        System.out.println("Welcome to my calculator");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int number1 = input.nextInt();

        System.out.println("Enter another number");
        int number2 = input.nextInt();

//        int addition = number1 + number2;
//        System.out.println("Number1 & Number2 = " + addition);

//        int addition = number1 - number2;
//        System.out.println("Number1 & Number2 = " + addition);

//        int addition = number1 * number2;
//        System.out.println("Number1 & Number2 = " + addition);

        int addition = number1 / number2;
        System.out.println("Number1 & Number2 = " + addition);


    }


}


//        System.out.println("Enter a number");
//        double number1 = input.nextDouble();
//
//        System.out.println("Enter another number");
//        double number2 = input.nextDouble();
//
//        double addition = number1 + number2;
//        System.out.println("Number1 & Number2 = " + addition);

//        Welcome to my calculator
//        Enter a number
//        550.50
//        Enter another number
//        750.50
//        Number1 & Number2 = 1301.0
//
//        Process finished with exit code 0